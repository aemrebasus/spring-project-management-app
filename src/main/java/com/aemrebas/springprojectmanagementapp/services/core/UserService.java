package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService<ID> extends IService<User, ID> {

    List<User> findByOrganizationId(ID id);

    List<User> findByOrganizationName(String name);

    Optional<User> findByEmail(String email);

    List<User> findByUserRolesName(String name);

}