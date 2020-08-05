package com.aemrebas.springprojectmanagementapp.repositories;

import com.aemrebas.springprojectmanagementapp.domain.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, Long> {
}
