package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findAllByName(String name);

    List<UserRole> findAllByUsersOrganizationId(Long id);

    List<UserRole> findAllByUsersOrganizationName(String name);

}
