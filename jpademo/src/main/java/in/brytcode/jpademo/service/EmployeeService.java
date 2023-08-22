package in.brytcode.jpademo.service;




import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.brytcode.jpademo.entity.Employee;
import in.brytcode.jpademo.entity.Vehical;
import in.brytcode.jpademo.entity.model.VehicalModel;
import in.brytcode.jpademo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepo;
	public Employee saveEmp(Employee emp) {
		empRepo.save(emp);
		return emp;
	}
	@Transactional(propagation = Propagation.REQUIRED)
	public Employee getEmp(int empId) {
		Employee emp =  empRepo.findById(empId).orElse(null);						
		return emp;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<VehicalModel> getVehicalModels(int empId) {
		Employee emp =  empRepo.findById(empId).orElse(null);
		List<Vehical> vehicals = emp.getVehicals();		
		List<VehicalModel> vehicalModels = new ArrayList<>();
		//vehicalModels = vehicals.stream().map(this::toVehicalModel).collect(Collectors.toList());
		
		for(Vehical vehical:vehicals) {
			VehicalModel vehicalModel = new VehicalModel();
			BeanUtils.copyProperties(vehical, vehicalModel);
			vehicalModels.add(vehicalModel);
		}
		return vehicalModels;		
	}
	
	public VehicalModel toVehicalModel(Vehical vehical) {
		VehicalModel vm = new VehicalModel();
		BeanUtils.copyProperties(vehical, vm);
		return vm;
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Vehical> getVehicals(int empId) {
		Employee emp =  empRepo.findById(empId).orElse(null);
		List<Vehical> vehicals = emp.getVehicals();		
		return vehicals;		
	}
}
