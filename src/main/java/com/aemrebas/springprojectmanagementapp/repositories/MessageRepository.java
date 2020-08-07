package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.MESSAGE_STATUS;
import com.aemrebas.springprojectmanagementapp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findAllBySenderId(Long id);

    List<Message> findAllByReceiverId(Long id);

    List<Message> findAllBySubjectContains(String subject);

    List<Message> findAllByContentContains(String content);

    List<Message> findAllBySenderIdAndReceiverId(Long senderId, Long receiverId);

    List<Message> findAllBySenderEmail(String email);

    List<Message> findAllBySenderFirstName(String firstName);

    List<Message> findALlsBySenderLastName(String lastName);

    List<Message> findAllByReceiverFirstName(String firstName);

    List<Message> findALlsByReceiverLastName(String lastName);

    List<Message> findAllBySenderOrganizationId(Long id);

    List<Message> findAllBySenderOrganizationName(String name);

    List<Message> findAllByStatus(MESSAGE_STATUS status);


}
