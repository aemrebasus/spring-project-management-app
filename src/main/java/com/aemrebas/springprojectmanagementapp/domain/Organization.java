package com.aemrebas.springprojectmanagementapp.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
