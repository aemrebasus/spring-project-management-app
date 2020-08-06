package com.aemrebas.springprojectmanagementapp.services.desc;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.User;

import java.util.List;

public interface UserService<ID> extends IService<User, ID> {

    List<User> findByOrganizationId(ID id);

}