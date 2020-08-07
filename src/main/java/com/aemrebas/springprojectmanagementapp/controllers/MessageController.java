package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Message;
import com.aemrebas.springprojectmanagementapp.services.MessageServiceImp;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * Messages' route controller
 */
@RestController
@RequestMapping("${rest.messages}")
public class MessageController extends MessageServiceImp {

    @Override
    @GetMapping
    public List<Message> findAll() {
        return super.findAll();
    }

    @Override
    @GetMapping("{id}")
    public Optional<Message> findById(@PathVariable Long id) {
        return super.findById(id);
    }

    @Override
    @PostMapping
    public void saveOne(@RequestBody Message entity) {
        super.saveOne(entity);
    }

    @Override
    @PutMapping("{id}")
    public void updateOneById(@PathVariable Long id, @RequestBody Message updated) {
        super.updateOneById(id, updated);
    }

    @Override
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        super.deleteById(id);
    }
}
