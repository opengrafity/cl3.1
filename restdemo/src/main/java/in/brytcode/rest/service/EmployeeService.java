package in.brytcode.rest.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.brytcode.rest.entity.Employee;
import in.brytcode.rest.repository.EmployeeRepository;
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	public Employee getEmployee(int empId) {
		return empRepo.findById(empId).orElse(new Employee());
	}
	
	public Employee createEmployee(Employee emp) {
		empRepo.save(emp);
		return emp;
	}
	
	public Employee updateSalary(int empId, BigDecimal salary) {
		Employee emp = empRepo.findById(empId).orElse(null);
		if(emp != null) {
			emp.setSalary(salary);
			empRepo.save(emp);
		}
		return emp;
	}
}
