package com.mongo.example.mongodbexample.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// THE lombok will automatically create all the Setters , Getters and ToString also
@Getter
@Setter
@ToString

@Document(collection = "students")
public class Student {

    @Id
    private int id;
    private String name;
    private String city;
    private String college;

}
