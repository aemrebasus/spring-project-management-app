package com.aemrebas.springprojectmanagementapp.marketing;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Promotion is a single standalone entity that stores promotions, ads, and news about the business.
 */
@Entity
@Data
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;
    private String imageURL;
    private String uiComponent;
    private Date createdAt;
    private Date expiresAt;

    public Promotion(String title, String content, String imageURL, String uiComponent, Date createdAt, Date expiresAt) {
        this.title = title;
        this.content = content;
        this.imageURL = imageURL;
        this.uiComponent = uiComponent;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
    }
}
