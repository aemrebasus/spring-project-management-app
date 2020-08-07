package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;

import java.util.List;

public interface IssueService<ID> extends IService<Issue, ID> {
    List<Issue> findByTagName(String name);

    List<Issue> findByOrganizationId(ID id);
    List<Issue> findByProjectId(ID id);
    List<Issue> findByUserId(ID id);

    List<Issue> findByOrganizationName(String organizationName);
    List<Issue> findByProjectName(String name);
}
