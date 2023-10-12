package com.brytcode.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private int empId;
    private String empName;
    private Date doj;

    public Employee() {
    }

    public Employee(int empId, String empName, Date doj) {
        this.empId = empId;
        this.empName = empName;
        this.doj = doj;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", doj=" + doj +
                '}';
    }
}
