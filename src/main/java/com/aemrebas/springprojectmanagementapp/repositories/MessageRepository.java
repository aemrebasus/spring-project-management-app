package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findAllMessagesBySenderId(Long id);

    List<Message> findAllMessagesByReceiverId(Long id);

    List<Message> findAllMessagesBySubjectContains(String subject);

    List<Message> findAllMessagesByContentContains(String content);

    List<Message> findAllMessagesBySenderIdAndReceiverId(Long senderId, Long receiverId);
}
