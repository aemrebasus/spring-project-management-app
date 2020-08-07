package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.MESSAGE_STATUS;
import com.aemrebas.springprojectmanagementapp.domain.Message;
import com.aemrebas.springprojectmanagementapp.repositories.MessageRepository;
import com.aemrebas.springprojectmanagementapp.services.core.MessageService;
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
    public List<Message> findBySenderId(Long id) {
        return messageRepository.findAllBySenderId(id);
    }

    @Override
    public List<Message> findByReceiverId(Long id) {
        return messageRepository.findAllByReceiverId(id);
    }

    @Override
    public List<Message> findBySubject(String subject) {
        return messageRepository.findAllBySubjectContains(subject);
    }

    @Override
    public List<Message> findByContent(String content) {
        return messageRepository.findAllByContentContains(content);
    }

    @Override
    public List<Message> findBySenderIdAndReceiverId(Long senderId, Long receiverId) {
        return messageRepository.findAllBySenderIdAndReceiverId(senderId, receiverId);
    }

    @Override
    public List<Message> findBySenderEmail(String email) {
        return messageRepository.findAllBySenderEmail(email);
    }

    @Override
    public List<Message> findBySenderFirstName(String firstName) {
        return messageRepository.findAllBySenderFirstName(firstName);
    }

    @Override
    public List<Message> findsBySenderLastName(String lastName) {
        return messageRepository.findALlsBySenderLastName(lastName);
    }

    @Override
    public List<Message> findByReceiverFirstName(String firstName) {
        return messageRepository.findAllByReceiverFirstName(firstName);
    }

    @Override
    public List<Message> findsByReceiverLastName(String lastName) {
        return messageRepository.findALlsByReceiverLastName(lastName);
    }

    @Override
    public List<Message> findByOrganizationId(Long id) {
        return messageRepository.findAllBySenderOrganizationId(id);
    }

    @Override
    public List<Message> findByOrganizationName(String name) {
        return messageRepository.findAllBySenderOrganizationName(name);
    }

    @Override
    public List<Message> findByStatus(MESSAGE_STATUS status) {
        return messageRepository.findAllByStatus(status);
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public Optional<Message> findById(Long id) {
        return messageRepository.findById(id);
    }

    @Override
    public void saveOne(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void updateOneById(Long id, Message message) {
        Message existingMessage = messageRepository.findById(id).get();
        BeanUtils.copyProperties(message, existingMessage, "id");
    }

    @Override
    public void deleteById(Long id) {
        messageRepository.deleteById(id);
    }
}
