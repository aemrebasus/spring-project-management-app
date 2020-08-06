package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;

import java.util.List;

public interface IssueService extends IService<Issue> {
    List<Issue> findAllIssuesByTagName(String name);

    List<Issue> findAllIssuesByUserId(Long id);
}
