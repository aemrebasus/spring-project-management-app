package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllProjectsByOrganizationId(Long id);

    List<Project> findAllProjectsByOrganizationName(String name);

    List<Project> findAllProjectsByDescriptionContains(String description);

    List<Project> findByName(String name);

    List<Project> findOneProjectByNameContains(String name);


}
