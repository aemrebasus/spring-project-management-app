package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;
import com.aemrebas.springprojectmanagementapp.services.core.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${rest.projects}")
public class ProjectController {

    @Autowired
    private ProjectService<Long> projectService;

    @GetMapping
    public List<Project> findAll() {
        return projectService.findAll();
    }

    @GetMapping("${rest.byId}")
    public Optional<Project> findById(@PathVariable Long id) {
        return projectService.findById(id);
    }

    @PostMapping
    public void saveOne(@RequestBody Project entity) {
        projectService.saveOne(entity);
    }

    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody Project entity) {
        projectService.updateOneById(id, entity);
    }

    @DeleteMapping("${rest.byId}")
    public void deleteById(Long id) {
        projectService.deleteById(id);
    }

    @GetMapping("${ret.byOrganizationId")
    public List<Project> findByOrganizationId(@PathVariable Long id) {
        return projectService.findByOrganizationId(id);
    }

    @GetMapping("${rest.byDescriptionContains")
    public List<Project> findByDescription(@PathVariable String description) {
        return projectService.findByDescription(description);
    }

    @GetMapping("${rest.byProjectName")
    public List<Project> findByName(@PathVariable String name) {
        return projectService.findByName(name);
    }

}
