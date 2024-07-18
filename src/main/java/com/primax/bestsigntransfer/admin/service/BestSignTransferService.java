package com.primax.bestsigntransfer.admin.service;

import com.primax.bestsigntransfer.admin.domain.to.PersonCollectionResult;

import java.util.List;

public interface BestSignTransferService {

    Integer addInaugurationInfoDG(List<PersonCollectionResult> results, String type,String identity);

    Integer addInaugurationInfoCQ(List<PersonCollectionResult> results, String types,String identity);

    Integer addInaugurationInfoKS(List<PersonCollectionResult> results, String types,String identity);
}
