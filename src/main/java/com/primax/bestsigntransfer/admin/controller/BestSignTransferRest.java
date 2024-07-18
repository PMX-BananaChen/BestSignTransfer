package com.primax.bestsigntransfer.admin.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.primax.bestsigntransfer.admin.domain.entity.Signcabinet;
import com.primax.bestsigntransfer.admin.domain.to.PersonCollectionResult;
import com.primax.bestsigntransfer.admin.service.BestSignTransferService;
import com.primax.bestsigntransfer.admin.service.ISigncabinetService;
import com.primax.bestsigntransfer.config.BestSignConfig;
import com.primax.bestsigntransfer.config.NotifyConfig;
import com.primax.bestsigntransfer.model.AjaxResult;
import com.primax.bestsigntransfer.model.HttpStatus;
import com.primax.bestsigntransfer.model.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对接上上签接口
 *
 * @author stan
 * @date 2022-05-06
 */
@RequestMapping("/pmx/bestSignTransfer")
@RestController
public class BestSignTransferRest extends BestSignConfig {

    private static final Logger logger = LoggerFactory.getLogger(BestSignTransferRest.class);

    /**
     * 上上签数据绑定插入
     */
    @Autowired
    private BestSignTransferService bestSignTransferService;

    /**
     * 生效档案柜配置信息
     */
    @Autowired
    private ISigncabinetService signCabinetService;

    /**
     * 接收异步回调
     * 处理下阶段业务
     *
     * @param request
     * @return AjaxResult
     */
    @PostMapping("bestSignCallBack")
    @ResponseBody
    public AjaxResult BestSignCallBack(HttpServletRequest request, @RequestBody JSONObject jsonObject, HttpServletResponse response) throws Exception {
        AjaxResult r = AjaxResult.error();
        try {
            logger.info("异步消息获取的参数:" + jsonObject.toJSONString());
            String client_Id = jsonObject.getString("clientId");
            String type = jsonObject.getString("type");
            JSONObject responseData = jsonObject.getJSONObject("responseData");
            Integer info = 0;
            /**
             * 校验clientId
             */
            if (!BestSignConfig.clientId.equals(client_Id)) {
                return AjaxResult.error(HttpStatus.UNAUTHORIZED, "client校验失败");
            }
            /**
             * 获取到个人资料的授权或个人重新提交资料
             */
            Map paramMap = new HashMap();
            paramMap.put("needAuth", true);
            String account = "";
            String archiveId = "";
            if (NotifyConfig.CUSTOMER_AUTH.equals(type)) {
                if (null != responseData) {
                    JSONObject personInfo = responseData.getJSONObject("personInfo");
                    if (null != personInfo) {
                        //个人账号
                        account = personInfo.getString("联系方式");
                    }
                    //档案柜ID
                    archiveId = responseData.getString("archiveId");
                }
                paramMap.put("account", account);
                paramMap.put("archiveId", archiveId);
            } else if (NotifyConfig.RESUBMISSION.equals(type)) {
                if (null != responseData) {
                    //个人账号
                    account = responseData.getString("contact");
                    //档案柜ID
                    archiveId = responseData.getString("archiveId");
                }
                paramMap.put("account", account);
                paramMap.put("archiveId", archiveId);
            }
            String jsonString = JSON.toJSONString(paramMap);
            JSONObject object = JSONObject.parseObject(jsonString);
            String result = bestSignClient.executeRequest(BestSignConfig.GET_PERSON_COLLECTION_PATH, "POST", object);
            Signcabinet cabinet = signCabinetService.selectSigncabinet(archiveId);

            JSONObject jsonResult = JSONObject.parseObject(result);
            JSONObject data1 = jsonResult.getJSONObject("data");
            JSONObject auth = data1.getJSONObject("auth");
            String identity = auth.getString("identity");
            JSONArray collectionInfoArray = data1.getJSONArray("collectionInfo");
            if(null != collectionInfoArray){
                List<PersonCollectionResult> results = collectionInfoArray.toJavaList(PersonCollectionResult.class);
                if (results != null && results.size() > 0 && cabinet != null && StringUtils.isNotBlank(cabinet.getTypes())) {
                    if (cabinet.getArea().equals("DG")) {
                        info = bestSignTransferService.addInaugurationInfoDG(results, cabinet.getTypes(),identity);
                    } else if (cabinet.getArea().equals("CQ")) {
                        info = bestSignTransferService.addInaugurationInfoCQ(results, cabinet.getTypes(),identity);
                    } else if (cabinet.getArea().equals("KS")) {
                        info = bestSignTransferService.addInaugurationInfoKS(results, cabinet.getTypes(),identity);
                    }
                }
            }
            if (info != 1) {
                /**
                 * 写入失败,记录报错日志
                 */
            }
            return AjaxResult.success("success");

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return AjaxResult.success("success");
    }

    /**
     * 获取request参数
     *
     * @param request
     * @return StringBuffer
     */
    public static StringBuffer dealInputStream(HttpServletRequest request) {
        StringBuffer data = new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String s;
            while ((s = reader.readLine()) != null) {
                data.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
