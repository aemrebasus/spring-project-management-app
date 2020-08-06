package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.services.IssueService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Issues' route controller
 */
@RestController
@RequestMapping("/api/v1/issues")
public class IssueController implements IControllers<Issue, Long> {

    @Autowired
    IssueService issueService;

    @Override
    @GetMapping
    public List<Issue> getAll() {
        return issueService.findAll();
    }

    @Override
    @GetMapping("{id}")
    public Optional<Issue> getById(@PathVariable Long id) {
        return issueService.findById(id);
    }

    @Override
    @DeleteMapping("{id}")
    public void deleteOneById(@PathVariable Long id) {
        issueService.deleteById(id);
    }

    @Override
    @PostMapping
    public void createOne(@RequestBody final Issue entity) {
        issueService.saveOne(entity);
    }

    @Override
    public void updateOneById(final Long aLong, Issue updated) {
        Issue existingIssue = issueService.findById(aLong).get();
        BeanUtils.copyProperties(updated, existingIssue, "id");
    }
}
