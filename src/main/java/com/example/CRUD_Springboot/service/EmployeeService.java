package com.example.CRUD_Springboot.service;

import com.example.CRUD_Springboot.model.Employee;
import com.example.CRUD_Springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Gets data types 'List' and 'Optional' from Java.util
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    //@Autowired help in dependency injection
    //Here @autowired injects 'EmployeeRepository' into this field
    //when creating the 'EmployeeService'
    @Autowired
    private EmployeeRepository employeeRepository;

    //calls findall() method of employeeRepository to fetch all employees
    //returns List<Employee> which is list of all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //calls findById() method which retrieves an employee by their ID.
    //returns Optional<Employee> which means it returns option containing employee
    //or empty if not found
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    //Calls the save method of EmployeeRepository to save the new employee
    //returns the created employee entity.
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //First this function finds employee by ID and sets the entity with the request body
    //Saves the updated employee using the save method of EmployeeRepository.
    //Returns the updates Employee in that ID
    public Employee updateEmployee(String id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        employee.setName(employeeDetails.getName());
        employee.setDepartment(employeeDetails.getDepartment());
        employee.setSalary(employeeDetails.getSalary());
        return employeeRepository.save(employee);
    }

    //Deletes the employee using the delete method of EmployeeRepository in that ID
    public void deleteEmployee(String id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        employeeRepository.delete(employee);
    }
}

