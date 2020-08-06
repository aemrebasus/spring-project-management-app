package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Project;
import com.aemrebas.springprojectmanagementapp.repositories.ProjectRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("projectService")
public class ProjectServiceImp implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public void saveOne(Project entity) {
        projectRepository.save(entity);
    }

    @Override
    public void updateOneById(Long id, Project entity) {
        Project existing = projectRepository.getOne(id);
        BeanUtils.copyProperties(entity, existing, "id");
    }

    @Override
    public void deleteById(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public List<Project> findAllProjectsByOrganizationId(Long id) {
        return projectRepository.findAllProjectsByOrganizationId(id);
    }

    @Override
    public List<Project> findAllProjectsByDescriptionContains(String description) {
        return projectRepository.findAllProjectsByDescriptionContains(description);
    }

    @Override
    public Optional<Project> findOneProjectByName(String name) {
        return projectRepository.findOneProjectByName(name);
    }

    @Override
    public Optional<Project> findOneProjectByNameContains(String name) {
        return projectRepository.findOneProjectByNameContains(name);
    }
}
