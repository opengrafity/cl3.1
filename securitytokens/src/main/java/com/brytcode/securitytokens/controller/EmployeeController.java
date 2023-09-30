package com.brytcode.securitytokens.controller;

import com.brytcode.securitytokens.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") String empId){
        return new Employee(1,"Kumar",25000000);
    }
}
