package com.aemrebas.springprojectmanagementapp.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
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
    /**
     * Root
     */
    @Value("${rest.root}")
    public String root;
    @Value("${rest.projects}")
    public String projects;
    @Value("${rest.users}")
    public String users;
    @Value("${rest.organizations}")
    public String organizations;
    @Value("${rest.comments}")
    public String comments;
    @Value("${rest.messages}")
    public String messages;
    @Value("${rest.issues}")
    public String issues;
    @Value("${rest.tags}")
    public String tags;
    @Value("${rest.roles}")
    public String roles;

    /**
     * byId
     */
    public String byId;
    public String byOrganizationId;
    public String byOrganizationsId;
    public String byUserId;
    public String byIssueId;
    public String byProjectId;

    /**
     * byName
     */
    public String byName;
    public String byTitle;
    public String byOrganizationName;
    public String byProjectName;
    public String byTagName;
    public String byUserName;
    public String byContent;
    public String byFirstName;
    public String byLastName;

    /**
     * byContent
     */
    public String byContentContains;
    public String byDescription;
    public String byDescriptionContains;
    public String byEmail;

    /**
     * byUserRole
     */
    public String byUserRole;

    /**
     * Messaging
     * byId
     */
    public String bySenderId;
    public String byReceiverId;

    /**
     * byEmail
     */
    public String bySenderEmail;
    public String byReceiverEmail;

    /**
     * bySubject
     */
    public String bySubject;
}