package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import com.aemrebas.springprojectmanagementapp.services.core.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${rest.comments}")
public class CommentController {

    @Autowired
    private CommentService<Long> commentService;

    @GetMapping("${rest.byIssueId}")
    public List<Comment> findByIssueID(@PathVariable Long id) {
        return commentService.findByIssueID(id);
    }
    @GetMapping("${rest.byContent}")
    public List<Comment> findByContent(@PathVariable String content) {
        return commentService.findByContent(content);
    }

    @GetMapping("${rest.byUserId")
    public List<Comment> findByUserId(@PathVariable Long id) {
        return commentService.findByUserId(id);
    }

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping("${rest.byId}")
    public Optional<Comment> findById(@PathVariable Long id) {
        return commentService.findById(id);
    }

    @PostMapping
    public void saveOne(@RequestBody Comment entity) {
        commentService.saveOne(entity);
    }


    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody Comment entity) {
        commentService.updateOneById(id, entity);
    }


    @DeleteMapping("${rest.byId}")
    public void deleteById(@PathVariable Long id) {
        commentService.deleteById(id);
    }

}
