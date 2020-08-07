package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.services.IssueServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Issues' route controller
 */
@RestController
@RequestMapping("${rest.issues}")
public class IssueController extends IssueServiceImp {

    @Override
    @GetMapping
    public List<Issue> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("${rest.byId}")
    public Optional<Issue> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Override
    @GetMapping("${rest.byTagName}")
    public List<Issue> findAllIssuesByTagName(@PathVariable String name) {
        return super.findAllIssuesByTagName(name);
    }

    @Override
    @GetMapping("${rest.byUserId}")
    public List<Issue> findAllIssuesByUserId(@PathVariable Long id) {
        return super.findAllIssuesByUserId(id);
    }


    @Override
    @GetMapping("${rest.byProjectId}")
    public List<Issue> findAllIssuesByProjectId(@PathVariable Long id) {
        return super.findAllIssuesByProjectId(id);
    }

    @Override
    @GetMapping("${rest.byOrganizationName}")
    public List<Issue> findAllIssuesByProjectOrganizationName(@PathVariable String organizationName) {
        return super.findAllIssuesByProjectOrganizationName(organizationName);
    }

    @Override
    @GetMapping("${rest.byOrganizationId}")
    public List<Issue> findAllIssuesByProjectOrganizationId(@PathVariable Long id) {
        return super.findAllIssuesByProjectOrganizationId(id);
    }

    @Override
    @PostMapping
    public void saveOne(@RequestBody Issue entity) {
        super.saveOne(entity);
    }

    @Override
    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody Issue entity) {
        super.updateOneById(id, entity);
    }

    @Override
    @DeleteMapping("${rest.byId}")
    public void deleteById(@PathVariable Long id) {
        super.deleteById(id);
    }
}
