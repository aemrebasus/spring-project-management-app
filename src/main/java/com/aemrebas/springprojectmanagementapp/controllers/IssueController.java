package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.services.core.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Issues' route controller
 */
@RestController
@RequestMapping("${rest.issues}")
public class IssueController {

    @Autowired
    private IssueService<Long> issueService;

    @GetMapping
    public List<Issue> findAll() {
        return issueService.findAll();
    }

    @GetMapping("${rest.byId}")
    public Optional<Issue> findById(@PathVariable Long id) {
        return issueService.findById(id);
    }

    @GetMapping("${rest.byTagName}")
    public List<Issue> findAllIssuesByTagName(@PathVariable String name) {
        return issueService.findByTagName(name);
    }

    @GetMapping("${rest.byUserId}")
    public List<Issue> findAllIssuesByUserId(@PathVariable Long id) {
        return issueService.findByUserId(id);
    }


    @GetMapping("${rest.byProjectId}")
    public List<Issue> findAllIssuesByProjectId(@PathVariable Long id) {
        return issueService.findByProjectId(id);
    }

    @GetMapping("${rest.byOrganizationName}")
    public List<Issue> findAllIssuesByProjectOrganizationName(@PathVariable String name) {
        return issueService.findByOrganizationName(name);
    }

    @GetMapping(value = {"${rest.byOrganizationId}", "${rest.byOrganizationsId}"})
    public List<Issue> findAllIssuesByProjectOrganizationId(@PathVariable Long id) {
        return issueService.findByOrganizationId(id);
    }

    @PostMapping
    public void saveOne(@RequestBody Issue entity) {
        issueService.saveOne(entity);
    }

    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody Issue entity) {
        issueService.updateOneById(id, entity);
    }

    @DeleteMapping("${rest.byId}")
    public void deleteById(@PathVariable Long id) {
        issueService.deleteById(id);
    }
}
