package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Organization;
import com.aemrebas.springprojectmanagementapp.repositories.OrganizationRepository;
import com.aemrebas.springprojectmanagementapp.services.core.OrganizationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("organizationService")
public class OrganizationServiceImp implements OrganizationService<Long> {

    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public List<Organization> findAll() {
        return organizationRepository.findAll();
    }

    @Override
    public Optional<Organization> findById(Long id) {
        return organizationRepository.findById(id);
    }

    @Override
    public void saveOne(Organization organization) {
        organizationRepository.save(organization);
    }

    @Override
    public void updateOneById(Long id, Organization updated) {
        Optional<Organization> existingOrg = organizationRepository.findById(id);
        BeanUtils.copyProperties(updated, existingOrg, "id");
    }

    @Override
    public void deleteById(Long id) {
        organizationRepository.deleteById(id);
    }

    @Override
    public Optional<Organization> findByName(String name) {
        return organizationRepository.findByName(name);
    }

    @Override
    public List<Organization> findByNameContains(String name) {
        return organizationRepository.findByNameContains(name);
    }
}
