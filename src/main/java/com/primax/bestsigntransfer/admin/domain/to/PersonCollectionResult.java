package com.primax.bestsigntransfer.admin.domain.to;

import lombok.Data;

import java.util.List;

/**
 * 接收上上签个人资料pattern
 */
@Data
public class PersonCollectionResult {

    private String collectionName;

    private String storeType;

    private String content;

    private String checkStatus;

    private String resourceAuthorizationStatus;

    private List<String> fileContents;

}
