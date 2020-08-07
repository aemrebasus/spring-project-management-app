package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Message;

import java.util.List;

public interface MessageService<ID> extends IService<Message, ID> {
    List<Message> findBySenderId(ID id);

    List<Message> findByReceiverId(ID id);

    List<Message> findBySubject(String String);

    List<Message> findByContent(String string);

}
