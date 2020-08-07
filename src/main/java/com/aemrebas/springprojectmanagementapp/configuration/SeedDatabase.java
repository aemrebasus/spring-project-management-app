package com.aemrebas.springprojectmanagementapp.configuration;

import com.aemrebas.springprojectmanagementapp.domain.*;
import com.aemrebas.springprojectmanagementapp.services.core.*;
import org.postgresql.core.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Seeding the database
 */
@Component
@Profile("dev")
public class SeedDatabase implements CommandLineRunner {
    @Autowired
    private OrganizationService organizationService;
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
    private TagService tagService;
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public void run(String... args) throws Exception {

        Provider<Long> rnd = () -> (long) Math.floor(Math.random() * 900000 + 100000);
        Provider<Integer> rnd10 = () -> (int) Math.floor(Math.random() * 10);
        Provider<User> rndUser = () -> (User) userService.findAll().get(rnd10.get());
        Provider<List<User>> rndUsers = () -> (List<User>) userService.findAll().subList(0, rnd10.get());

        Provider<Project> rndProject = () -> (Project) projectService.findAll().get(rnd10.get());
        Provider<Organization> rndOrg = () -> (Organization) organizationService.findAll().get(rnd10.get());
        Provider<Issue> rndIssue = () -> (Issue) issueService.findAll().get(rnd10.get());
        Provider<List<Issue>> rndIssues = () -> (List<Issue>) issueService.findAll().subList(0, rnd10.get());

        Consumer<Runnable> tenTimes = (functionalInterface) -> {
            for (int i = 0; i < 30; i++) functionalInterface.run();
        };


        tenTimes.accept(() -> organizationService.saveOne(new Organization(rnd.get(), "Org-" + rnd.get())));
        tenTimes.accept(() -> projectService.saveOne(new Project(rnd.get(), "Project-Name-" + rnd.get(), "Description-" + rnd.get(), LocalDateTime.now(), rndOrg.get())));
        tenTimes.accept(() -> userService.saveOne(new User(rnd.get(), "firstName-" + rnd.get(), "lastName-" + rnd.get(), "email" + rnd.get() + "@gmail.com", "pas" + rnd.get(), null, rndOrg.get())));
        tenTimes.accept(() -> issueService.saveOne(new Issue(rnd.get(), "title-" + rnd.get(), "description-" + rnd.get(), LocalDateTime.now(), null, null, rndUser.get(), rndProject.get(), rndOrg.get())));
        tenTimes.accept(() -> messageService.saveOne(new Message(rnd.get(), "subj-" + rnd.get(), "content-" + rnd.get(), LocalDateTime.now(), MESSAGE_STATUS.PENDING, rndUser.get(), rndUser.get(), new ArrayList<>())));
        tenTimes.accept(() -> commentService.saveOne(new Comment(rnd.get(), "content-" + rnd.get(), LocalDateTime.now(), rndUser.get(), rndIssue.get())));
        tenTimes.accept(() -> tagService.saveOne(new Tag(rnd.get(), "name-" + rnd.get(), rndIssues.get(), new ArrayList<>())));
        tenTimes.accept(() -> userRoleService.saveOne(new UserRole(rnd.get(), "name-" + rnd.get(), rndUsers.get())));
    }

}













