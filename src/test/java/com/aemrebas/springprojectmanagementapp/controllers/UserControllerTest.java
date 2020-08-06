package com.aemrebas.springprojectmanagementapp.controllers;

import com.aemrebas.springprojectmanagementapp.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.context.event.annotation.BeforeTestMethod;


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
        generateTestData();
        it(get("/api/v1/users"), service.findAll(), getUsers());
    }
}