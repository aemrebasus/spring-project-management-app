package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Tag;

import java.util.List;

public interface TagService<ID> extends IService<Tag, ID> {

    List<Tag> findByIssueId(ID id);

    List<Tag> findByName(String name);

    List<Tag> findByIssueTitle(String title);

    List<Tag> findByIssueDescription(String description);

    List<Tag> findByMessageId(ID id);

    List<Tag> findByMessageSubject(String subject);
}
