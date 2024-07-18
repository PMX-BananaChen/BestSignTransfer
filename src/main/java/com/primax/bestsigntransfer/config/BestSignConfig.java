package com.primax.bestsigntransfer.config;

import com.primax.bestsigntransfer.client.BestSignClient;

public class BestSignConfig {
    /**测试
     * Account
     */
//    public static final String BEST_SIGN_ACCOUNT = "wisky.jiang@primax.com.cn";
    /**正式
     * Account
     */
    public static final String BEST_SIGN_ACCOUNT = "aixi.lo@primax.com.cn";

    /**测试
     * DeveloperId
     */
    public static final String BEST_SIGN_DEVELOPER_ID = "1649297235015336175";

    /**测试
     * 正式
     * ClientId
     */
//    public static final String clientId = "1649297235015336175";
    public static final String clientId = "1652257284014448844";

    /**
     * 测试
     * 正式
     * AccessKey/ClientSecret
     */
//    public static final String clientSecret = "4d83e38d153741cf8541f770e8fe41f1";
    public static final String clientSecret = "4b4010a0d428489999abce78b7c4a258";
    /**
     * 测试
     * BEST_SIGN_SIGNATURE_TYPE
     */
    public static final String BEST_SIGN_SIGNATURE_TYPE = "RSA256";
    /**
     * 测试
     * 正式
     * 密钥
     */
//    private static final String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCHBdcjXp8Ttm6weWOYkRuNUUi+6BUvVpaw9lFlQfhFu/hrakkx5Ix1EBgVzHlsC1dG4K8O01yD8+JHpMz/v3ULNVSNbkfe+j/vB8L+lBCdHyW8fjAwHmrIypFpfeDtjzR22Nh26LqOXMuDmf5klk4Qni+V4E7YSmIcbxc2OVDY/EyQNvSciy8TsjJgNlX0VDhFq3uJ0iiyV6R5Zcine2/4KmfM3+gLkH3sMYwRDUjnEYzUzp9sUW694UwU2DXgqMMYeYOSJVM+jw7lfA3gCqzayO01+LduowdSA2j1PQKGwvZuRHcn2znSVCRtqt7LWpMmvGPJH0MrJ3aG7nh30eOxAgMBAAECggEADeNe5qdz614ncoV55hZ+5AFJX0GV9EGOzHL5mlW3yMx11+6dysD8ZYobQBrBHojoGEVCHF9HM9dhHgdogqHZ0yZQJSADyn6pFtgQiYkHUHIEuqesIzbtuuuDG3u0KBtDxTm2wjxb/Aq1cDrlvMjtDK6IrHze/0ZfYxdWJuCsXTUn4kRZ5nfYFzMEf7v9/4Q+E59V2GiNYWTsi1qUDtN6cwE5Hexqu23kLdm0BXGZRlZXuVqxvRuRltE8ZkAGJ3GVvQqNqN5qq8rEm1YdmyRuuiZi2gxrdujIdQndVrSeimWrbOSGRim9sWMnDsBSl0gs/lB0iquawqfjIpHIzyBUNQKBgQDOYHU7Ajyfnf3cNfk+ec/N77oEVP43hyniiccNsxNkqUlWuoGcQKavzRGo2BLDxuEH2eNDtB+YuDjmOCjmuaoonfwTY5nmFg0hHPKLBT6UHhV3wxhj9emiPuECfoHEVQdY3ykpiG3CZH3TTsIhxBbnw65fMicdEBjLs8C3TGKgfwKBgQCnfS6Y8yTNjMCJ3ErF/+G9PmHSDlew1qGgWqvaw4KeB/1HVa42OlAXRjT4LhgAIl5kj0ck441e/She5NVsHFVCT6Qvh5jGDa3ttBQNRPpu2IiVS2iHTA3qrt0xUBxgrSYSDLwqZHMN9pi9bvy9Mf8v8cqnKaEXGFYb8JNdj39jzwKBgH9Tv8BCZwjLvz5IBpjnKrCSASB/F8FGoS7ldmwbWhG26EqcEy9GLBE24nhbp2gmodvoMHErBnuA3YociA+h6TvaDRYhU2hDnqIZbAMdnzhfPzt+oOO7awPw635Qctug4kGQnaLES4Ot4HuokdmnU8J2VnThSoSB0+qJ4pK0i/0dAoGBAJgEY7XJAf9aoCrAelGJ9P7JzwlToT3NIPelNFQjnbsHr1f+qVdox+bH/y2+0GPWzevhq4YMzvSHPAwdEKTGdo/wLypAnWYtZk7YYlbE47SV7inrPp2GZx85xWOLvaX1ohdB3ctwTok+59UQFm82INMIV5Ivk5mdqhJD4c1KgCo7AoGACxP5zMQOPiGgNYFYzjJne8yISTdEHaQ9yMSE95aA2jtpz/uxdxbTIGl0kpaBs7XD69L1Wp8FI7qvbHiwpFoyIOhXebQseQSiSblbq36sV+O/4zkh8tFdiPJDNx5AB6KQmJ8h4216qLTbG3uiVd2KQ8UQrdkDa6jISYkLYLwLFho=";
    private static final String privateKey = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDR+sbYTymaCLBoc/KJPMMqVkHCW0ASK7wgHE2O905qg50mgxbY46++NA0Z7xGXOX/dzmRH3LEb1XOjpPlBH9GLFgZ6g56QyRkzsDTDGHH8KTBNt6sYn2HZ5HpRjTaXviAc2elQB7y0BFUX0hyn/q98H+M8p2WBu2YD+7omzSzI5rFhVAq6DE7wO37a+iFfp3tLDqAhuUaMFsSJB53Z45zc50M3Hjr941tjq7+ki7fn4OPrkYHCVsTYo9zezb+bouyDWYw3snnUYMpHN0/AoehT/h+Ybpr2MIo2bZeqbvzyZteocdmouw22Hry4KW1yw8LXJpxn1ygt9V2pxkpCYb/JAgMBAAECggEBAIBttbkPkg5YSi1Y3Xr64xO99jJ9xU5X2ZR6OyW6NQgIv9GSVCML/62CAJFgG4426PItDkC1xs2TXEs22Azw/STor8W3QwCjPvrSRzMcfHsSZizirY89zIeMqxO+Hynoa5O55G3CjbQ9Ah6zsDtAFu0AQ+gRKpCSoe7FxDF/RGkLM+aPAB/xCvcRbnlfNXGbeeZPO5xmn6p9ry0Y8+36anBE66TT75keAj7r2R5vJyl+FOVmZnfZllMky6kWbS/9L7yfAon5lPB5JNci0nVdTAK+rAx2SdnNzRzJbCTw1xA8/ntjbMmsQxPhbhe3OUeY8f00Gb7bwUBr7XhZ6g1mhFECgYEA+xRbOvrCxzf0YmSB2yrNXGEyTMSFvp0+uiiCaTzjOpgsPyZgSVH3vKdJrTzURfZ1wuoQ3tn2LKBU83qjgKP8i0Zc1x8kj1jiYm8dfjTD1+MplGc4Ct1BZfNF7Ul8+Q68wrv/oTZ+mpskyJTXYp7bK+wo1ekoQTmpXmc3Txso7MMCgYEA1hg5yMeiKE2yI/sllph6GFy8QLEoavtaXgyS/nY7knURfaelnwW7Kaanwxg9egL1+9BOARu5oqNg7fO44dxtinvqcnb5EHTqQQML4rZaQwWyf4Xo8DPCkfemN1qahNcldAe+OEKpgJFAtFdmrWmLfQ0iKPuR2vJFa2vlfcAjiIMCgYEAq9NIg9psRc3jLxq9S3HFTH0v4R10sfgGn3ttk/uZPdY6IZVvu32e3rpVT3sbgi2idZudpATh1bR7roy1LCoNgHrMumOTr44Sj26fbmlJxYquP+NLlRPJ161eo37xSbhuMY5a6MbUaZXW3HYP2GwCbdKWN53ycIC3ieV1Emvx2+UCgYEAuCvE4aRiKVuVCADPN/pY5cY4p0n+4/DvrwIQHVgmLPoKHtbt0ZuDgvP7UwfyMpiDdKifwbJRAcib5HaJr7oIfV3Vs7wGy5JXxa9SNSf7A7bN84eFd8R+90Rbtzh4vhe5/1N93jXyTEgnqjuZd0nZFa0Lmse2k+tfrmX12DRGHPMCgYEAyOtem29+qsofxKExnMkPtulaZwlwzsL9En6eI3Psu+ptrbaSxwfMXwj3m/RoakUTZiGn1sag567rJ3KjkhvTJOu5Ccp3Xc2oqfID0Pvi1pl8xxGieC/Ah7ictVdJYuj/3e/qff5Owt8AZ52Fnz1+upCMNqK2rAs03f7bTyHFlOs=";

    /**
     * 测试
     * 测试
     * 正式
     * sdkUrl
     */
//    public static final String host = "https://ectqa.primax.com.cn";
//    public static final String host = "https://10.40.254.140";
    public static final String host = "https://ect.primax.com.cn";

    /**测试
     * Token获取方法
     * token
     */
    public static final String GET_TOKEN_PATH = "/api/oa2/client-credentials/token";

    /**
     * 查询个人资料列表
     * get-person-collection
     */
    public static final String GET_PERSON_COLLECTION_LIST = "/api/ents/box/get-person-collection-list";

    /**
     * 下载个人资料
     * get-person-collection
     */
    public static final String GET_PERSON_COLLECTION_PATH = "/api/ents/box/get-person-collection";
    /**
     * 发起方补充个人资料
     * person-proxy-collection
     */
    public static final String PERSON_PROXY_COLLECTION_PATH = "/api/ents/box/person-proxy-collection";
    /**
     * 发送合同
     * send-contracts-sync-v2
     */
    public static final String SEND_CONTRACTS_SYNC_V2 = "/api/templates/send-contracts-sync-v2";

    /**
     * 测试
     * 上上签客户端
     */
    protected final BestSignClient bestSignClient = new BestSignClient(host, clientId, clientSecret, privateKey);
}
