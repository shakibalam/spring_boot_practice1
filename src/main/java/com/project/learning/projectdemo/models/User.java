package com.project.learning.projectdemo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User
{
    @Id
    private Integer id;
    private String name;
    private String city;
    private String number;
}
