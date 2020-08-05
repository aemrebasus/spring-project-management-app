package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import com.aemrebas.springprojectmanagementapp.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
