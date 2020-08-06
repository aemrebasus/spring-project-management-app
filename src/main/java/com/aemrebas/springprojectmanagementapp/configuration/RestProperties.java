package com.aemrebas.springprojectmanagementapp.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/6/2020
 @since 1.0.0 
*/

/**
 * Routes configuration
 */
@Component
@ConfigurationProperties("rest")
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
    @Getter private static String byName;
    @Getter private static String byContent;
    @Getter private static String byContentContains;
    @Getter private static String byId;
    @Getter private static String byOrganizationId;
    @Getter private static String byUserId;
    @Getter private static String byProjectName;
}
;