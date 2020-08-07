package com.aemrebas.springprojectmanagementapp.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
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
public class RestProperties {
    @Getter private static String root;
    @Getter private static String projects;
    @Getter private static String users;
    @Getter private static String organizations;
    @Getter private static String comments;
    @Getter private static String messages;
    @Getter private static String issues;
    @Getter private static String tags;
    @Getter private static String roles;



    @Getter private static String byId;
    @Getter private static String byOrganizationId;
    @Getter private static String byUserId;
    @Getter private static String byIssueId;
    @Getter private static String byProjectId;


    @Getter private static String byName;
    @Getter private static String byOrganizationName;
    @Getter private static String byProjectName;
    @Getter private static String byTagName;
    @Getter private static String byUserName;


    @Getter private static String byContent;
    @Getter private static String byContentContains;
    @Getter private static String byDescription;
    @Getter private static String byDescriptionContains;



}
;