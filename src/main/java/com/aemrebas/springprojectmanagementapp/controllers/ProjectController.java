package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;
import com.aemrebas.springprojectmanagementapp.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/projects")
public class ProjectController implements IControllers<Project, Long> {

    @Autowired
    private ProjectService projectService;

    @Override
    @GetMapping
    public List<Project> getAll() {
        return projectService.findAll();
    }

    @Override
    @GetMapping("{id}")
    public Optional<Project> getById(@PathVariable Long id) {
        return projectService.findById(id);
    }

    @GetMapping("/name/{name}")
    public Optional<Project> getByName(@PathVariable String name) {
        return projectService.findOneProjectByName(name);
    }

    @Override
    @DeleteMapping("{id}")
    public void deleteOneById(@PathVariable Long id) {
        projectService.deleteById(id);
    }


    @Override
    @PostMapping
    public void createOne(@RequestBody Project entity) {
        projectService.saveOne(entity);
    }

    @Override
    @PutMapping("{id}")
    public void updateOneById(@PathVariable Long id, @RequestBody Project updated) {
        projectService.updateOneById(id, updated);
    }
}
