package com.aemrebas.springprojectmanagementapp.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Component;

/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

/**
 * The properties will be gotten
 */
@Component
@ConfigurationProperties("rest")
@PropertySource("classpath:restfull.properties")
public class RestFullProperties {
    private String root;
    private String projects;
    private String users;
    private String organizations;
    private String comments;
    private String messages;
    private String issues;
    private String tags;
    private String roles;
    private String byId;
    private String byOrganizationId;
    private String byUserId;
    private String byIssueId;
    private String byProjectId;
    private String byName;
    private String byOrganizationName;
    private String byProjectName;
    private String byTagName;
    private String byUserName;
    private String byContent;
    private String byContentContains;
    private String byDescription;
    private String byDescriptionContains;
    private String byEmail;
    private String byUserRole;
}