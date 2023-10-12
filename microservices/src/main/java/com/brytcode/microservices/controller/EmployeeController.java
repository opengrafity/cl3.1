package com.brytcode.microservices.controller;

import com.brytcode.microservices.entity.Employee;
import com.brytcode.microservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/{empId}")
    public Employee getEmployee(@PathVariable("empId")Integer empId){
        return employeeService.getEmployee(empId);
    }
}
