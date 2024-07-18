package com.primax.bestsigntransfer.quartz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.primax.bestsigntransfer.admin.domain.entity.Signcabinet;
import com.primax.bestsigntransfer.admin.mapper.SigncabinetMapper;
import com.primax.bestsigntransfer.config.BestSignConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Component
@EnableScheduling
public class QueryEmpInfoListJob extends BestSignConfig {
    private static final Logger logger = LoggerFactory.getLogger(QueryEmpInfoListJob.class);

    @Resource
    private SigncabinetMapper signcabinetMapper;

    /**
     * 查询个人资料列表定时任务
     */
    public void queryEmpInfoListTask() {
        String archiveId;
        HashMap<String,Object> map;
        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now();
        List<Signcabinet> signcabinets = signcabinetMapper.selectList(Wrappers.<Signcabinet>query().lambda().eq(Signcabinet::getStatus, "1"));

        for (Signcabinet signcabinet:
        signcabinets) {
            archiveId = signcabinet.getCabinet();
            map =new HashMap<>();
            map.put("collectionTimeStart",now1);
            map.put("collectionTimeEnd",now1);
            map.put("collectionStatus",2);
            map.put("archiveId",archiveId);
            String s = JSONObject.toJSONString(map);
            logger.info("查询个人资料列表组装参数:" + s);
            JSONObject jsonObject = JSONObject.parseObject(s);
            String result = bestSignClient.executeRequest(BestSignConfig.GET_PERSON_COLLECTION_LIST, "POST", jsonObject);
            logger.info("查询个人资料列表返回参数:" + JSON.toJSONString(result));
        }

    }
}
