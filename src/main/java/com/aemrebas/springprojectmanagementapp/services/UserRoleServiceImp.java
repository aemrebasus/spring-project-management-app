package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.UserRole;
import com.aemrebas.springprojectmanagementapp.services.desc.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userRoleService")
public class UserRoleServiceImp implements UserRoleService<Long> {
    @Override
    public List<UserRole> findAll() {
        return null;
    }

    @Override
    public Optional<UserRole> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void saveOne(UserRole entity) {

    }

    @Override
    public void updateOneById(Long aLong, UserRole entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
