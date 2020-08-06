package com.aemrebas.springprojectmanagementapp.services.desc;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService<ID> extends IService<Project,ID> {
    List<Project> findAllProjectsByOrganizationId(ID id);

    List<Project> findAllProjectsByDescriptionContains(String description);

    Optional<Project> findOneProjectByName(String name);

    Optional<Project> findOneProjectByNameContains(String name);
}
