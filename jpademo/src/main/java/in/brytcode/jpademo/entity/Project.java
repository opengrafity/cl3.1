package in.brytcode.jpademo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int projectId;
	private String projectName;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="ProjectResources",joinColumns = {@JoinColumn(name="projectId")}, inverseJoinColumns = {@JoinColumn(name="empId")})
	private List<Employee> employees = new ArrayList<>();
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
