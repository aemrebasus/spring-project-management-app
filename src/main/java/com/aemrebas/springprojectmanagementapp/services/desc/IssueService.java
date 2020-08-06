package com.aemrebas.springprojectmanagementapp.services.desc;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;

import java.util.List;

public interface IssueService<ID> extends IService<Issue,ID> {
    List<Issue> findAllIssuesByTagName(String name);
    List<Issue> findAllIssuesByUserId(Long id);
}
