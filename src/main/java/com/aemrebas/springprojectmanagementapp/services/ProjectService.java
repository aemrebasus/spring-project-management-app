package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;

import java.util.List;

public interface ProjectService extends IService<Project> {
    List<Project> findAllProjectsByOrganizationId(Long id);

    List<Project> findAllProjectsByDescriptionContains(String description);

    Project findOneProjectByName(String name);

    Project findOneProjectByNameContains(String name);
}
