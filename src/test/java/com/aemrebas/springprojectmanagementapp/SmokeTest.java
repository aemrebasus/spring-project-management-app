package com.aemrebas.springprojectmanagementapp;

import com.aemrebas.springprojectmanagementapp.controllers.IssueController;
import com.aemrebas.springprojectmanagementapp.controllers.MessageController;
import com.aemrebas.springprojectmanagementapp.controllers.UserController;
import com.aemrebas.springprojectmanagementapp.repositories.IssueRepository;
import com.aemrebas.springprojectmanagementapp.repositories.MessageRepository;
import com.aemrebas.springprojectmanagementapp.repositories.UserRepository;
import com.aemrebas.springprojectmanagementapp.services.core.IssueService;
import com.aemrebas.springprojectmanagementapp.services.core.MessageService;
import com.aemrebas.springprojectmanagementapp.services.core.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SmokeTest {
    @Autowired
    private UserController userController;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private IssueController issueController;
    @Autowired
    private IssueService issueService;
    @Autowired
    private IssueRepository issueRepository;
    @Autowired
    private MessageController messageController;
    @Autowired
    private MessageService messageService;
    @Autowired
    private MessageRepository messageRepository;


    @Test
    public void contextLoad() throws Exception {

        // TODO: check all beans against Null
        assertThat(userController).isNotNull();
        assertThat(issueController).isNotNull();
        assertThat(messageController).isNotNull();
        assertThat(userService).isNotNull();
        assertThat(userRepository).isNotNull();
        assertThat(issueController).isNotNull();
        assertThat(issueService).isNotNull();
        assertThat(issueRepository).isNotNull();
        assertThat(messageController).isNotNull();
        assertThat(messageService).isNotNull();
        assertThat(messageRepository).isNotNull();


    }

}
