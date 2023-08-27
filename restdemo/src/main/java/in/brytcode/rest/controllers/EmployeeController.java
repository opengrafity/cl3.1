package in.brytcode.rest.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.brytcode.rest.entity.Employee;
import in.brytcode.rest.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	@GetMapping("{empId}")
	public Employee searchEmployee(@PathVariable("empId")int empId) {
		return empService.getEmployee(empId);
	}
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@RequestMapping(method = RequestMethod.HEAD)
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
	}
	@PutMapping("{empId}/salary/{salary}")
	public Employee updateSalary(@PathVariable("empId") int empId, @PathVariable("salary") BigDecimal salary) {
		return empService.updateSalary(empId, salary); 
	}
}
