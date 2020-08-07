package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.services.UserServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Users' route controller
 */
@RestController
@RequestMapping("${rest.users}")
public class UserController extends UserServiceImp {

    @Override
    @GetMapping
    public List<User> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("${rest.byId}")
    public Optional<User> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Override
    @GetMapping("${rest.byOrganizationId}")
    public List<User> findByOrganizationId(@PathVariable Long id) {
        return super.findByOrganizationId(id);
    }

    @Override
    @PostMapping
    public void saveOne(User user) {
        super.saveOne(user);
    }

    @Override
    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody User updatedUser) {
        super.updateOneById(id, updatedUser);
    }

    @Override
    @DeleteMapping("${rest.byId}")
    public void deleteById(@PathVariable Long id) {
        super.deleteById(id);
    }
}


