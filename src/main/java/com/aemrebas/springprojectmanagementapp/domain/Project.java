package com.aemrebas.springprojectmanagementapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;
    private String description;

    private Date created_at;

    @ManyToOne
    private Organization organization;


}
