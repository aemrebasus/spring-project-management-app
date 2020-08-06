package com.aemrebas.springprojectmanagementapp.services.desc;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;

import java.util.List;

public interface CommentService<ID> extends IService<Comment, ID> {
    List<Comment> findAllCommentsByIssueId(ID id);

    List<Comment> findAllCommentsByContentContains(String content);

    List<Comment> findAllCommentsByUserId(ID id);
}