package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Organization;
import com.aemrebas.springprojectmanagementapp.services.core.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${rest.organizations}")
public class OrganizationController  {

    @Autowired
    private OrganizationService<Long> organizationService;

    @GetMapping
    public List<Organization> findAll() {
        return organizationService.findAll();
    }

    @GetMapping("${rest.byId}")
    public Optional<Organization> findById(@PathVariable Long id) {
        return organizationService.findById(id);
    }

    @PostMapping
    public void saveOne(@RequestBody Organization organization) {
        organizationService.saveOne(organization);
    }

    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody Organization updated) {
        organizationService.updateOneById(id, updated);
    }

    @DeleteMapping("${rest.byId")
    public void deleteById(@PathVariable Long id) {
        organizationService.deleteById(id);
    }
}
