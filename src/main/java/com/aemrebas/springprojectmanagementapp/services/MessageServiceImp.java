package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Message;
import com.aemrebas.springprojectmanagementapp.repositories.MessageRepository;
import com.aemrebas.springprojectmanagementapp.services.desc.MessageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("messageService")
public class MessageServiceImp implements MessageService<Long> {
    @Autowired
    MessageRepository messageRepository;

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public void saveOne(Message entity) {
        messageRepository.save(entity);
    }

    @Override
    public void updateOneById(Long id, Message updated) {
        Message existingMessage = messageRepository.getOne(id);
        BeanUtils.copyProperties(updated, existingMessage, "id");
    }

    @Override
    public void deleteById(Long id) {
        messageRepository.deleteById(id);
    }
}
