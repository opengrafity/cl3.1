package com.brytcode.microservices.service;

import com.brytcode.microservices.entity.Employee;
import com.brytcode.microservices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository empRepo;
    public Employee getEmployee(int empId){
        return empRepo.findById(empId);
    }
}
