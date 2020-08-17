package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Organization;

import java.util.List;
import java.util.Optional;

public interface OrganizationService<ID> extends IService<Organization, ID> {
    Optional<Organization> findByName(String name);

    List<Organization> findByNameContains(String name);
}
