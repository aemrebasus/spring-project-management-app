package com.aemrebas.springprojectmanagementapp.repositories;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    Optional<Organization> findByName(String name);

    Optional<Organization> findByNameContains(String name);

}
