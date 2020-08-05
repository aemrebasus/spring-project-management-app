package com.aemrebas.springprojectmanagementapp.repositories;

import com.aemrebas.springprojectmanagementapp.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
