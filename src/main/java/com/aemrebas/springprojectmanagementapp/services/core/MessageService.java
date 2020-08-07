package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.MESSAGE_STATUS;
import com.aemrebas.springprojectmanagementapp.domain.Message;

import java.util.List;

public interface MessageService<ID> extends IService<Message, ID> {
    List<Message> findBySenderId(Long id);

    List<Message> findByReceiverId(Long id);


    List<Message> findBySubject(String subject);

    List<Message> findByContent(String content);

    List<Message> findBySenderIdAndReceiverId(Long senderId, Long receiverId);

    List<Message> findBySenderEmail(String email);

    List<Message> findBySenderFirstName(String firstName);

    List<Message> findsBySenderLastName(String lastName);

    List<Message> findByReceiverFirstName(String firstName);

    List<Message> findsByReceiverLastName(String lastName);

    List<Message> findByOrganizationId(Long id);

    List<Message> findByOrganizationName(String name);

    List<Message> findByStatus(MESSAGE_STATUS status);

}
