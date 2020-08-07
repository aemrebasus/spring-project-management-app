package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import com.aemrebas.springprojectmanagementapp.services.CommentServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${rest.components}")
public class CommentController extends CommentServiceImp {

    @Override
    @GetMapping
    public List<Comment> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("${rest.byId}")
    public Optional<Comment> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Override
    @GetMapping("${rest.byIssueId}")
    public List<Comment> findAllCommentsByIssueId(@PathVariable Long id) {
        return super.findAllCommentsByIssueId(id);
    }

    @Override
    @GetMapping("${rest.byContentContains}")
    public List<Comment> findAllCommentsByContentContains(@PathVariable String content) {
        return super.findAllCommentsByContentContains(content);
    }

    @Override
    @GetMapping("${rest.byUserId")
    public List<Comment> findAllCommentsByUserId(@PathVariable Long id) {
        return super.findAllCommentsByUserId(id);
    }

    @Override
    @PostMapping
    public void saveOne(@RequestBody Comment entity) {
        super.saveOne(entity);
    }

    @Override
    @PutMapping("${rest.byId")
    public void updateOneById(@PathVariable Long id, @RequestBody Comment entity) {
        super.updateOneById(id, entity);
    }

    @Override
    @DeleteMapping("${rest.byId")
    public void deleteById(@PathVariable Long id) {
        super.deleteById(id);
    }

}
