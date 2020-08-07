package com.aemrebas.springprojectmanagementapp.services.core;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService<ID> extends IService<Project, ID> {

    List<Project> findByOrganizationId(ID id);

    List<Project> findByOrganizationName(String name);

    List<Project> findByDescription(String description);

    List<Project> findByName(String name);

}
