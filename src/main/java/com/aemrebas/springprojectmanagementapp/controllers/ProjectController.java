package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;
import com.aemrebas.springprojectmanagementapp.services.ProjectServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("${rest.projects}")
public class ProjectController extends ProjectServiceImp {

    @Override
    @GetMapping
    public List<Project> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("${rest.byId")
    public Optional<Project> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Override
    @PostMapping
    public void saveOne(@RequestBody Project entity) {
        super.saveOne(entity);
    }

    @Override
    @PutMapping("${rest.ById}")
    public void updateOneById(@PathVariable Long id, @RequestBody Project entity) {
        super.updateOneById(id, entity);
    }

    @Override
    @DeleteMapping("${rest.byId}")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    @GetMapping("${ret.byOrganizationId")
    public List<Project> findAllProjectsByOrganizationId(@PathVariable Long id) {
        return super.findAllProjectsByOrganizationId(id);
    }

    @Override
    @GetMapping("${rest.byDescriptionContains")
    public List<Project> findAllProjectsByDescriptionContains(@PathVariable String description) {
        return super.findAllProjectsByDescriptionContains(description);
    }

    @Override
    @GetMapping("${rest.byProjectName")
    public Optional<Project> findOneProjectByName(@PathVariable String name) {
        return super.findOneProjectByName(name);
    }

    @Override
    @GetMapping("${rest.byProjectNameContains")
    public Optional<Project> findOneProjectByNameContains(@PathVariable String name) {
        return super.findOneProjectByNameContains(name);
    }
}
