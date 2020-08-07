package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Message;
import com.aemrebas.springprojectmanagementapp.services.core.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Messages' route controller
 */
@RestController
@RequestMapping("${rest.messages}")
public class MessageController {

    @Autowired
    private MessageService<Long> messageService;


    @GetMapping
    public List<Message> findAll() {
        return messageService.findAll();
    }

    @GetMapping("${rest.byId}")
    public Optional<Message> findById(@PathVariable Long id) {
        return messageService.findById(id);
    }

    @PostMapping
    public void saveOne(@RequestBody Message entity) {
        messageService.saveOne(entity);
    }

    @PutMapping
    public void updateOneById(@PathVariable Long id, @RequestBody Message updated) {
        messageService.updateOneById(id, updated);
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        messageService.deleteById(id);
    }

    @GetMapping("${rest.bySenderId}")
    public List<Message> findBySenderId(@PathVariable Long id) {
        return messageService.findBySenderId(id);
    }

    @GetMapping("${rest.byReceiverId}")
    public List<Message> findByReceiverId(@PathVariable Long id) {
        return messageService.findByReceiverId(id);
    }

    @GetMapping("${rest.bySubject}")
    public List<Message> findBySubject(@PathVariable String subject) {
        return messageService.findBySubject(subject);
    }

    @GetMapping("${rest.byContent}")
    public List<Message> findByContent(@PathVariable String content) {
        return messageService.findByContent(content);
    }


}
