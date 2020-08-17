package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.repositories.IssueRepository;
import com.aemrebas.springprojectmanagementapp.services.core.IssueService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("issueService")
public class IssueServiceImp implements IssueService<Long> {

    @Autowired
    private IssueRepository issueRepository;


    @Override
    public List<Issue> findAll() {
        return issueRepository.findAll();
    }

    @Override
    public Optional<Issue> findById(Long id) {
        return issueRepository.findById(id);
    }

    @Override
    public List<Issue> findByTagName(String name) {
        return issueRepository.findAllIssuesByTagsName(name);
    }

    @Override
    public List<Issue> findByDescription(String description) {
        return issueRepository.findAllIssuesByDescriptionContains(description);
    }

    @Override
    public List<Issue> findByTitle(String title) {
        return issueRepository.findAllIssuesByTitleContains(title);
    }


    @Override
    public List<Issue> findByUserId(Long id) {
        return issueRepository.findAllIssuesByUserId(id);
    }

    @Override
    public List<Issue> findByFirstName(String name) {
        return issueRepository.findAllIssuesByUserFirstName(name);
    }

    @Override
    public List<Issue> findByEmail(String email) {
        return issueRepository.findAllIssuesByUserEmail(email);
    }

    @Override
    public List<Issue> findByLastName(String name) {
        return issueRepository.findAllIssuesByUserLastName(name);
    }

    @Override
    public List<Issue> findByProjectId(Long id) {
        return issueRepository.findAllIssuesByProjectId(id);
    }

    @Override
    public List<Issue> findByProjectName(String name) {
        return issueRepository.findAllIssuesByProjectName(name);
    }

    @Override
    public List<Issue> findByOrganizationName(String organizationName) {
        return issueRepository.findAllIssuesByProjectOrganizationName(organizationName);
    }

    @Override
    public List<Issue> findByOrganizationId(Long id) {
        return issueRepository.findAllIssuesByProjectOrganizationId(id);
    }

    @Override
    public void saveOne(Issue entity) {
        issueRepository.save(entity);
    }

    @Override
    public void updateOneById(Long id, Issue entity) {
        Issue existingIssue = issueRepository.findById(id).get();
        BeanUtils.copyProperties(entity, existingIssue, "id");
    }

    @Override
    public void deleteById(Long id) {
        issueRepository.deleteById(id);
    }

}
