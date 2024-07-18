//package com.primax.bestsigntransfer;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.primax.bestsigntransfer.admin.domain.to.PersonCollectionResult;
//import com.primax.bestsigntransfer.config.BestSignConfig;
//import com.primax.bestsigntransfer.quartz.PlenishBestSignInfoJob;
//import com.primax.bestsigntransfer.quartz.QueryEmpInfoListJob;
//import com.primax.bestsigntransfer.quartz.SendContractJob;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class Test1 extends BestSignConfig {
//
//    @Autowired
//    private PlenishBestSignInfoJob plenishBestSignInfoJob;
//
//    @Autowired
//    private SendContractJob sendContractJob;
//
//    @Autowired
//    private QueryEmpInfoListJob queryEmpInfoListJob;
//
//    @Test
//    public void test01() throws Exception {
//        String result = bestSignClient.queryToken();
//        System.out.println(result);
//    }
//
//    /**
//     * 发送合同接口测试
//     * @throws Exception
//     */
//    @Test
//    public void test02() throws Exception {
//        String json = "{\n" +
//                "    \"templateId\":\"3040670503749550089\",\n" +
//                "    \"roles\":[\n" +
//                "        {\n" +
//                "            \"roleId\":\"3040671045099979781\",\n" +
//                "            \"userInfo\":{\n" +
//                "                \"userAccount\":\"17671756820\"\n" +
//                "            }\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"roleId\":\"3040671045158700032\",\n" +
//                "            \"userInfo\":{\n" +
//                "                \"userAccount\":\"wisky.jiang@primax.com.cn\",\n" +
//                "                \"enterpriseName\":\"东莞东聚电子电讯制品有限公司\"\n" +
//                "            }\n" +
//                "        }\n" +
//                "    ],\n" +
//                "    \"sender\":{\n" +
//                "        \"enterpriseName\":\"东莞东聚电子电讯制品有限公司\",\n" +
//                "        \"account\":\"wisky.jiang@primax.com.cn\",\n" +
//                "        \"bizName\":\"人事业务线\"\n" +
//                "    },\n" +
//                "    \"sendAction\":\"SEND_AND_SIGN\",\n" +
//                "    \"textLabels\":[\n" +
//                "        {\n" +
//                "            \"name\":\"职务名称\",\n" +
//                "            \"value\":\"工程师\"\n" +
//                "        }\n" +
//
//                "    ]\n" +
//                "}";
//        JSONObject object = JSONObject.parseObject(json);
////        ContractsTo contractsTo = JSON.parseObject(json, ContractsTo.class);
//        String result = bestSignClient.executeRequest(BestSignConfig.SEND_CONTRACTS_SYNC_V2,"POST",object);
//        System.out.println(result);
//    }
//
//    /**
//     * 下载个人档案资料接口测试
//     * @throws Exception
//     */
//    @Test
//    public void test03() throws Exception {
//        String json = "{\n" +
//                "    \"archiveId\": 3049305407899041795,\n" +
//                "    \"account\": \"17671756820\",\n" +
//                "    \"needAuth\": true\n" +
//                "}";
//        JSONObject object = JSONObject.parseObject(json);
//        String result = bestSignClient.executeRequest(BestSignConfig.GET_PERSON_COLLECTION_PATH,"POST",object);
//        JSONObject jsonResult = JSONObject.parseObject(result);
//        JSONObject data1 = jsonResult.getJSONObject("data");
//        JSONArray collectionInfoArray = data1.getJSONArray("collectionInfo");
//        System.out.println(collectionInfoArray.toJSONString());
//    }
//
//    /**
//     * 发起方补充资料接口测试
//     * @throws Exception
//     */
//    @Test
//    public void test04() throws Exception {
//        String json = "{\n" +
//                "    \"account\": \"17671756820\",\n" +
//                "    \"archiveId\": \"3039193284896359430\",\n" +
//                "    \"name\": \"郑楚威\",\n" +
//                "    \"collections\": [\n" +
//                "        {\n" +
//                "            \"content\": \"511507\",\n" +
//                "            \"proxyCollectionName\": \"工号\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"content\": \"PMX\",\n" +
//                "            \"proxyCollectionName\": \"厂区\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"content\": \"IT\",\n" +
//                "            \"proxyCollectionName\": \"部门\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"content\": \"男\",\n" +
//                "            \"proxyCollectionName\": \"性别\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"content\": \"362228199508201850\",\n" +
//                "            \"proxyCollectionName\": \"身份证\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"content\": \"汉\",\n" +
//                "            \"proxyCollectionName\": \"民族\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"content\": \"中国\",\n" +
//                "            \"proxyCollectionName\": \"国籍\"\n" +
//                "        }\n" +
//                "    ]\n" +
//                "}";
//        JSONObject object = JSONObject.parseObject(json);
//        String result = bestSignClient.executeRequest(BestSignConfig.PERSON_PROXY_COLLECTION_PATH,"POST",object);
//        System.out.println(result);
//    }
//
//    /**
//     * 发起方补充资料接口测试
//     * @throws Exception
//     */
//    @Test
//    public void test05() throws Exception {
//        Map paramMap = new HashMap();
//        paramMap.put("account","account");
//        paramMap.put("archiveId","account");
//        paramMap.put("needAuth",true);
//        String jsonString = JSON.toJSONString(paramMap);
//
//        List<PersonCollectionResult> dd =new ArrayList<>();
//        System.out.println(jsonString);
//    }
//
//    /**
//     * 测试正则
//     * @throws Exception
//     */
//    @Test
//    public void test06() throws Exception {
//        String str = "19_18";
//
//        //正则表达式：
//        /**
//         * 1,先创建一个Pattern对象，模式对象，可以理解成一个正则表达式对象
//         * 2,创建一个匹配器对象
//         * 3,开始循环匹配
//         */
//        StringBuffer content1 = new StringBuffer("");
//        Pattern patter = Pattern.compile("([0-9]+)|([_]+)|([\\u4E00-\\u9FA5]+)");
//        //匹配数字时，[0-9]
//        //数字+英文单词 ([0-9]+)|([a-zA-Z]+)
//        //按照patter（模式/样式）。到content文本中匹配，找到true。否false
//        Matcher matcher = patter.matcher(str);
//        while (matcher.find()) {
//            //匹配内容，文本放到matcher.group(); 中
////            System.out.println("找到：" + matcher.group(0));
//            content1.append(matcher.group(0));
//        }
//        System.out.println(content1);
//    }
//
//    /**
//     * 发起方补充资料接口测试
//     * @throws Exception
//     */
//    @Test
//    public void test07() throws Exception {
//        plenishBestSignInfoJob.plenishBestSignInfoTask();
//    }
//
//    /**
//     * 发起合同测试
//     * @throws Exception
//     */
//    @Test
//    public void test08() throws Exception {
//        sendContractJob.sendContractTask();
//    }
//
//    /**
//     * 查询个人资料列表
//     * @throws Exception
//     */
//    @Test
//    public void test09() throws Exception {
//        queryEmpInfoListJob.queryEmpInfoListTask();
//    }
//
//}
