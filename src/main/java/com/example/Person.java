package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by student on 5/11/17.
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;


}

