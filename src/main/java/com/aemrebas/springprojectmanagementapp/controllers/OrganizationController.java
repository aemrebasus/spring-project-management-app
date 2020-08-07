package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.configuration.RestfullProperties;
import com.aemrebas.springprojectmanagementapp.domain.Organization;
import com.aemrebas.springprojectmanagementapp.services.OrganizationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("${rest.organizations}")
public class OrganizationController extends OrganizationServiceImp {


    @Override
    @GetMapping
    public List<Organization> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("${rest.byId}")
    public Optional<Organization> findById(Long id) {
        return super.findById(id);
    }

    @Override
    @PostMapping
    public void saveOne(@RequestBody Organization organization) {
        super.saveOne(organization);
    }

    @Override
    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody Organization updated) {
        super.updateOneById(id, updated);
    }

    @Override
    @DeleteMapping("${rest.byId")
    public void deleteById(@PathVariable Long id) {
        super.deleteById(id);
    }
}
