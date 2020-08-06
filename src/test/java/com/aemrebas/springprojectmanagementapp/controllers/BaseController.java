package com.aemrebas.springprojectmanagementapp.controllers;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import com.aemrebas.springprojectmanagementapp.services.desc.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


/**
 * @implSpec example test method
 * User user = new User()
 * .setFirstName("Ahmet")
 * .setLastName("Emrebas")
 * .setEmail("aemrebasus@gmail.com");
 * <p>
 * users.add(user);
 * <p>
 * List<String> expectedData = new ArrayList<>();
 * expectedData.add(user.getFirstName());
 * expectedData.add(user.getLastName());
 * expectedData.add(user.getEmail());
 * <p>
 * it(get("/api/v1/users"), service.findAll(), users, expectedData);
 */
public class BaseController extends MockData {

    // TODO: Add implemented services below. They be used inside the corresponding TestClass
    @MockBean
    protected UserService service;


    @Autowired
    protected MockMvc mockMvc;

    /**
     * Request
     *
     * @param request               is get, post, put, or delete  inside the @package org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
     * @param serviceMethodResponse returnedValue of the service's method ( run the service method)
     * @param data     you must create a dummy data and store it inside the corresponding storage above (users, issues, messages etc.) use the add method!
     * @throws Exception
     */
    void it(MockHttpServletRequestBuilder request, Object serviceMethodResponse, Object data) throws Exception {
        when(serviceMethodResponse).thenReturn(data);
        ResultActions actions = mockMvc.perform(get("/api/v1/users")).andDo(print());
        actions.andExpect(content().string(new Gson().toJson(data).toString()));
        deleteTestData();
    }


}
