package com.aemrebas.springprojectmanagementapp.configuration;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("app")
@Data
public class ApplicationProperties {
    private String title;
    private String version;
    private String buildBy;
    private String licenseURL;
    private String baseURL;
}
