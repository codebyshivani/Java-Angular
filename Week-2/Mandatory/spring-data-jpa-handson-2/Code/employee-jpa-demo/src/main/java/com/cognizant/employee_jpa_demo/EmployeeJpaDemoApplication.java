package com.cognizant.employee_jpa_demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.employee_jpa_demo.model.Employee;
import com.cognizant.employee_jpa_demo.service.EmployeeService;

@SpringBootApplication
public class EmployeeJpaDemoApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeJpaDemoApplication.class);

    private static EmployeeService employeeService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(EmployeeJpaDemoApplication.class,args);

        employeeService = context.getBean(EmployeeService.class);

        LOGGER.info("Inside Main");

        testGetAllEmployees();

        testAddEmployee();
    }

    private static void testGetAllEmployees(){

        LOGGER.info("Fetching Employees");

        List<Employee> employees =
                employeeService.getAllEmployees();

        LOGGER.info("Employees : {}",employees);
    }

    private static void testAddEmployee(){

        Employee e = new Employee(4,"Arun",80000);

        employeeService.addEmployee(e);

        LOGGER.info("Employee Added Successfully");
    }
}
