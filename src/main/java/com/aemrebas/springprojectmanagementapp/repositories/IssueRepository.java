package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {


    List<Issue> findAllIssuesByUserId(Long id);

    List<Issue> findAllIssuesByTagsName(String name);

    List<Issue> findAllIssuesByProjectId(Long id);

    List<Issue> findAllIssuesByProjectOrganizationName(String name);

    List<Issue> findAllIssuesByProjectName(String name);

    List<Issue> findAllIssuesByProjectOrganizationId(Long id);
}
