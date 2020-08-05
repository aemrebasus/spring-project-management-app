package com.aemrebas.springprojectmanagementapp.repositories;

import com.aemrebas.springprojectmanagementapp.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
