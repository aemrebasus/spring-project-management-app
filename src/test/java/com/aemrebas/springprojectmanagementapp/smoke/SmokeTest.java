package com.aemrebas.springprojectmanagementapp.smoke;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.controllers.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class SmokeTest {
    @Autowired
    private UserController userController;
    // TODO: add all controllers here

    @Test
    public void contextLoad() throws Exception{
        assertThat(userController).isNotNull();
        //TODO: Add all assertions here.
    }
}
