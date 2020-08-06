package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import com.aemrebas.springprojectmanagementapp.services.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController implements IController<Comment, Long> {

    @Autowired
    private CommentService commentService;

    @Override
    @GetMapping
    public List<Comment> getAll() {
        return commentService.findAll();
    }

    @Override
    @GetMapping("{id}")
    public Optional<Comment> getById(@PathVariable Long id) {
        return commentService.findById(id);
    }

    @Override
    @DeleteMapping("{id}")
    public void deleteOneById(@PathVariable Long id) {
        commentService.deleteById(id);
    }

    @Override
    @PostMapping
    public void createOne(@RequestBody Comment entity) {
        commentService.saveOne(entity);
    }

    @Override
    @PutMapping("{id}")
    public void updateOneById(@PathVariable Long id, Comment updated) {
        Comment existingComment = commentService.findById(id).get();
        BeanUtils.copyProperties(updated, existingComment, "id");
    }


}
