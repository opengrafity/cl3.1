package in.brytcode.jpademo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.brytcode.jpademo.entity.Employee;
import in.brytcode.jpademo.entity.Project;
import in.brytcode.jpademo.entity.Vehical;
import in.brytcode.jpademo.entity.model.EmployeeModel;
import in.brytcode.jpademo.entity.model.VehicalModel;
import in.brytcode.jpademo.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepo;
	public void save(Project project) {
		projectRepo.save(project);
	}
	@Transactional
	public List<EmployeeModel> getEmployees(int projectId){
		Project project = projectRepo.findById(projectId).orElse(new Project());
		List<Employee> emps = project.getEmployees();
		List<EmployeeModel> empModels = new ArrayList<>();		
		for(Employee emp:emps) {
			empModels.add(getEmpModel(emp));
		}
		return empModels;
	}
	@Transactional
	public Project getProject(int projectId) {
		return projectRepo.findById(projectId).orElse(null);
	}
	
	private EmployeeModel getEmpModel(Employee emp) {
		EmployeeModel empModel = new EmployeeModel();
		List<VehicalModel> vehicalModels = new ArrayList<>();
		VehicalModel vehicalModel = null;
		for(Vehical vehical: emp.getVehicals()) {
			vehicalModel =  new VehicalModel();
			BeanUtils.copyProperties(vehical, vehicalModel); 
			vehicalModels.add(vehicalModel);
		}
		BeanUtils.copyProperties(emp, empModel);
		empModel.setVehicals(vehicalModels);
		return empModel;
	}
}
