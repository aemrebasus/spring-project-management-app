package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.UserRole;
import com.aemrebas.springprojectmanagementapp.repositories.UserRoleRepository;
import com.aemrebas.springprojectmanagementapp.services.core.UserRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userRoleService")
public class UserRoleServiceImp implements UserRoleService<Long> {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public Optional<UserRole> findById(Long id) {
        return userRoleRepository.findById(id);
    }

    @Override
    public void saveOne(UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    @Override
    public void updateOneById(Long id, UserRole updated) {
        UserRole existingRole = userRoleRepository.findById(id).get();
        BeanUtils.copyProperties(updated, existingRole, "id");
    }

    @Override
    public void deleteById(Long id) {
        userRoleRepository.deleteById(id);
    }
}
