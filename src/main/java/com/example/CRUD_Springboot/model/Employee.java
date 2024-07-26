package com.example.CRUD_Springboot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data automatically generates getter and setter function
@Data
//@Document marks the class Employee as MongoDB document
//and specifies collection name as "employees". Which means
//'Employee' will be saved in the collection "employees"
@Document(collection = "employees")
public class Employee {
    //Makes id as primary key in MongoDB Document
    @Id
    private String id;

    private String name;
    private String department;
    private double salary;

}
