package com.cognizant.employee_jpa_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee_jpa_demo.model.Employee;
import com.cognizant.employee_jpa_demo.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    @Transactional
    public void addEmployee(Employee employee){

        employeeRepository.save(employee);
    }
}
