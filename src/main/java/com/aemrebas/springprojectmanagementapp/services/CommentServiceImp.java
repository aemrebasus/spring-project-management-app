package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import com.aemrebas.springprojectmanagementapp.repositories.CommentRepository;
import com.aemrebas.springprojectmanagementapp.services.desc.CommentService;
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
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void saveOne(Comment entity) {
        commentRepository.save(entity);
    }

    @Override
    public void updateOneById(Long id, Comment entity) {
        Comment existingComment = commentRepository.findById(id).get();
        BeanUtils.copyProperties(entity, existingComment, "id");
    }

    @Override
    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public List<Comment> findAllCommentsByIssueId(Long id) {
        return commentRepository.findAllCommentsByIssueId(id);
    }

    @Override
    public List<Comment> findAllCommentsByContentContains(String content) {
        return commentRepository.findAllCommentsByContentContains(content);
    }

    @Override
    public List<Comment> findAllCommentsByUserId(Long id) {
        return commentRepository.findAllCommentsByUserId(id);
    }

}
