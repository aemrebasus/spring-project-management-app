package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Message;
import com.aemrebas.springprojectmanagementapp.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Messages' route controller
 */
@RestController
@RequestMapping("/api/v1/messages")
public class MessageController implements IController<Message, Long> {

    @Autowired
    private MessageService messageService;

    @Override
    @GetMapping
    public List<Message> getAll() {
        return messageService.findAll();
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Optional<Message> getById(@PathVariable final Long id) {
        return messageService.findById(id);
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteOneById(@PathVariable final Long id) {
        messageService.deleteById(id);
    }

    @Override
    @PostMapping
    public void createOne(@RequestBody final Message message) {
        messageService.saveOne(message);
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void updateOneById(@PathVariable final Long id, @RequestBody final Message updated) {
        messageService.updateOneById(id, updated);
    }
}
