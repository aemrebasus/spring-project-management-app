package com.aemrebas.springprojectmanagementapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

enum MESSAGE_STATUS {
    PENDING, DONE, REJECTED
}


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
