package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.services.IService;
import com.aemrebas.springprojectmanagementapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Users' end points
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController implements IControllers<User, Long> {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<User> getById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }


    @RequestMapping(value = "/org/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public List<User> getByOrganizationId(@PathVariable Long id) {
        return userService.findByOrganizationId(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOne(@RequestBody final User user) {
        userService.saveOne(user);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteOneById(@PathVariable Long id) {
        userService.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateOneById(@PathVariable Long id, @RequestBody User user) {
        userService.updateOneById(id, user);
    }
}


