package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByOrganizationId(Long id);

    List<User> findByOrganizationName(String name);

    Optional<User> findByEmail(String email); // select * from table-name where email = email

    Optional<User> findByUserName(String userName);

    Optional<User> findOneByUserName(String userName);

    List<User> findByEmailContains(String email);

    List<User> findByUserRolesName(String name);

    List<User> findByFirstNameContains(String firstName);

    List<User> findByLastNameContains(String lastName);


}
