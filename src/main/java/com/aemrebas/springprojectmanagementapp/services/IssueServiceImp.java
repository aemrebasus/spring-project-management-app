package com.aemrebas.springprojectmanagementapp.services;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.repositories.IssueRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class IssueServiceImp implements IssueService {

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
    public List<Issue> findAllIssuesByTagName(String name) {
        return issueRepository.findAllIssuesByTagsName(name);
    }

    @Override
    public List<Issue> findAllIssuesByUserId(Long id) {
        return issueRepository.findAllIssuesByUserId(id);
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
