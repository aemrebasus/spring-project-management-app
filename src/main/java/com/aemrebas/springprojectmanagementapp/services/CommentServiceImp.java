package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import com.aemrebas.springprojectmanagementapp.repositories.CommentRepository;
import com.aemrebas.springprojectmanagementapp.services.core.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("commentService")
public class CommentServiceImp implements CommentService<Long> {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findByIssueID(Long id) {
        return commentRepository.findAllCommentsByIssueId(id);
    }

    @Override
    public List<Comment> findByContent(String content) {
        return commentRepository.findAllCommentsByContentContains(content);
    }

    @Override
    public List<Comment> findByUserId(Long id) {
        return commentRepository.findAllCommentsByUserId(id);
    }

    @Override
    public List<Comment> findByUserName(String name) {
        return commentRepository.findAllCommentsByUserFirstName(name);
    }

    @Override
    public List<Comment> findByUserEmail(String email) {
        return commentRepository.findAllCommentsByUserEmail(email);
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void saveOne(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void updateOneById(Long id, Comment comment) {
        Comment existingComment = commentRepository.getOne(id);
        BeanUtils.copyProperties(comment, existingComment, "id");
    }

    @Override
    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }
}
