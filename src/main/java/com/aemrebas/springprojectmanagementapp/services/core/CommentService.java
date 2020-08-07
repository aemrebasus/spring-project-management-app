package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;

import java.util.List;


public interface CommentService<ID> extends IService<Comment, ID> {
    List<Comment> findByIssueID(ID id);

    List<Comment> findByContent(String content);

    List<Comment> findByUserId(ID id);

    List<Comment> findByUserName(String name);

    List<Comment> findByUserEmail(String email);

}
