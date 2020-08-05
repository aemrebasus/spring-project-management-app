package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

/**
 * @implNote  belongs to Message class
 */
enum MESSAGE_STATUS {
    PENDING, DONE, REJECTED
}

/**
 * Each message belongs to two different user, one is sender and the other is receiver.
 */
@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;
    private Date createdAt;
    private MESSAGE_STATUS status;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;

    public Message(String content, Date createdAt, MESSAGE_STATUS status, User sender, User receiver) {
        this.content = content;
        this.createdAt = createdAt;
        this.status = status;
        this.sender = sender;
        this.receiver = receiver;
    }
}
