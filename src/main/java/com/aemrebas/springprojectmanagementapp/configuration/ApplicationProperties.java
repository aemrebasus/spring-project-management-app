package com.aemrebas.springprojectmanagementapp.configuration;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@ConfigurationProperties("app")
@Data
@Service
public class ApplicationProperties {
    @Value("${app.title}")
    private String title;
    @Value("${app.version}")
    private String version;
    @Value("${app.author}")
    private String author;
    @Value("${app.licenseURL}")
    private String licenseURL;
}
