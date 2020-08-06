package com.aemrebas.springprojectmanagementapp.configuration;

import com.aemrebas.springprojectmanagementapp.services.IssueService;
import com.aemrebas.springprojectmanagementapp.services.MessageService;
import com.aemrebas.springprojectmanagementapp.services.ProjectService;
import com.aemrebas.springprojectmanagementapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedDatabase implements CommandLineRunner {


    @Autowired
    private ProjectService projectService;
    @Autowired
    private UserService userService;
    @Autowired
    private IssueService issueService;
    @Autowired
    private MessageService messageService;

    @Override
    public void run(String... args) throws Exception {

    }
}
