package com.example.CRUD_Springboot.repository;


import com.example.CRUD_Springboot.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


//EmployeeRepository interface uses Spring Data MongoDB Dependency
//which provide CRUD operations on Employee.
//Employee is the type of Entity and String is type of Entity's ID
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
