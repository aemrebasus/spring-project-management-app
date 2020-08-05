package com.aemrebas.springprojectmanagementapp.repositories;

import com.aemrebas.springprojectmanagementapp.domain.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
