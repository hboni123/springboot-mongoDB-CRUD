package com.example.CRUD_Springboot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employees")
public class Employee {
    @Id
    private String id;
    private String name;
    private String department;
    private double salary;

    // Getters and Setters
}
