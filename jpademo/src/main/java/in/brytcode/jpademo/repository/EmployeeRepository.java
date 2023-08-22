package in.brytcode.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.brytcode.jpademo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
