package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.domain.Issue;
import com.aemrebas.springprojectmanagementapp.domain.Message;
import com.aemrebas.springprojectmanagementapp.domain.User;
import com.aemrebas.springprojectmanagementapp.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class BaseController<T> {

    // TODO: Create List of each Entity above. They will be used inside the corresponding TestClass
    protected List<User> users = new ArrayList<>();
    protected List<Issue> issues = new ArrayList<>();
    protected List<Message> messages = new ArrayList<>();

    // TODO: Add implemented services below. They be used inside the corresponding TestClass
    @MockBean
    protected UserService service;


    @Autowired
    protected MockMvc mockMvc;

    void isRequestReturningTheExpectedData(MockHttpServletRequestBuilder request, T serviceMethodResponse, T mockedResponse, List<String> expectedData) throws Exception {
        when(serviceMethodResponse).thenReturn(mockedResponse);
        ResultActions actions = mockMvc.perform(get("/api/v1/users")).andDo(print());
        for (String text : expectedData) {
            actions.andExpect(content().string(containsString(text)));
        }
    }
}
