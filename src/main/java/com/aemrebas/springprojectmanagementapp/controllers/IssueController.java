package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/v1/issues")
public class IssueController implements IControllers<Issue, Long> {

    @Autowired


    @Override
    public List<Issue> getAll() {
        return null;
    }

    @Override
    public Optional<Issue> getById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public void deleteOneById(Long aLong) {

    }

    @Override
    public void createOne(Issue entity) {

    }

    @Override
    public void updateOneById(Long aLong, Issue updated) {

    }
}
