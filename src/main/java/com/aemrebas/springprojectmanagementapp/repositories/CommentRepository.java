package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllCommentsByIssueId(Long id);

    List<Comment> findAllCommentsByUserId(Long id);

    List<Comment> findAllCommentsByUserFirstName(String name);

    List<Comment> findAllCommentsByUserEmail(String email);

    List<Comment> findAllCommentsByContentContains(String content);

    List<Comment> findAllCommentsByIssueOrganizationName(String name);

    List<Comment> findAllCommentsByIssueOrganizationId(Long id);
}
