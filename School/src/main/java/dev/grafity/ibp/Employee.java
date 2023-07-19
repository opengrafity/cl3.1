package dev.grafity.ibp;

import java.util.UUID;

public class Employee {
    private String id;
    private String name;
    private double salary;
    private String taxChoice;
    private double investment;

    public Employee(){
        id = UUID.randomUUID().toString();
        taxChoice = "Old";
    }

    public Employee(String taxChoice){
        this();
        this.taxChoice = taxChoice;
    }
    public Employee(String name, String taxChoice, double salary){
        this(taxChoice);
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name,  double salary){
        this();
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTaxChoice() {
        return taxChoice;
    }

    public void setTaxChoice(String taxChoice) {
        this.taxChoice = taxChoice;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }
}
