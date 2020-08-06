package com.aemrebas.springprojectmanagementapp.configuration;

import com.aemrebas.springprojectmanagementapp.domain.Comment;
import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.domain.Organization;
import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.services.desc.*;
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
    @Autowired
    private CommentService commentService;

    @Autowired
    private OrganizationService organizationService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User()
                .setId(1l)
                .setFirstName("Ahmet")
                .setLastName("Emrebas")
                .setEmail("email@gmail.com")
                .setPassword("ABCD");

        userService.saveOne(user);

        commentService.saveOne(new Comment()
                .setContent("My Content")
                .setId(1l));

        commentService.saveOne(new Comment()
                .setContent("ABCD")
                .setId(12314l));

        issueService.saveOne(new Issue()
                .setId(1l)
                .setUser(user)
        );

        issueService.saveOne((new Issue()));

        organizationService.saveOne(new Organization(41231l, "TechOfKings"));
    }
}
