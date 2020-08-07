package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.services.core.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Users' route controller
 */
@RestController
@RequestMapping("${rest.users}")
public class UserController {

    @Autowired
    private UserService<Long> userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("${rest.byId}")
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("${rest.byOrganizationId}")
    public List<User> findByOrganizationId(@PathVariable Long id) {
        return userService.findByOrganizationId(id);
    }

    @PostMapping
    public void saveOne(User user) {
        userService.saveOne(user);
    }

    @PutMapping("${rest.byId}")
    public void updateOneById(@PathVariable Long id, @RequestBody User updatedUser) {
        userService.updateOneById(id, updatedUser);
    }

    @DeleteMapping("${rest.byId}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}


