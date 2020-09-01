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
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService<Long> userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping({"${rest.byId}", "/index/{id}", "/0/{id}"})
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping({"${rest.byFirstName}", "/firstname/{name}", "/fn/{name}", "/1/{name}"})
    public List<User> findByFirstName(@PathVariable String name) {
        return userService.findByFirstName(name);
    }

    @GetMapping({"${rest.byLastName}", "/lastname/{name}", "/ln/{name}", "/2/{name}"})
    public List<User> findByLastName(@PathVariable String name) {
        return userService.findByLastName(name);
    }
    @GetMapping("${rest.byEmail}")
    public List<User> findByEmail(@PathVariable String email) {
        return userService.findByEmailContains(email);
    }

    @GetMapping("${rest.byOrganizationId}")
    public List<User> findByOrganizationId(@PathVariable Long id) {
        return userService.findByOrganizationId(id);
    }

    @GetMapping("${rest.byOrganizationName}")
    public List<User> findByOrganizationName(@PathVariable String name) {
        return userService.findByOrganizationName(name);
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


