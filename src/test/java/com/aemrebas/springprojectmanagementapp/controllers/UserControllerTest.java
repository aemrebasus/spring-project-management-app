package com.aemrebas.springprojectmanagementapp.controllers;

import com.aemrebas.springprojectmanagementapp.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

@WebMvcTest(UserController.class)
class UserControllerTest extends BaseController {


    @Test
    void getAllMustReturnAllUsersFromService() throws Exception {
        User user = new User()
                .setFirstName("Ahmet")
                .setLastName("Emrebas")
                .setEmail("aemrebasus@gmail.com");

        users.add(user);

        List<String> expectedData = new ArrayList<>();
        expectedData.add(user.getFirstName());
        expectedData.add(user.getLastName());
        expectedData.add(user.getEmail());

        it(get("/api/v1/users"), service.findAll(), users, expectedData);
    }
}