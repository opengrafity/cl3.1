package in.brytcode.jpademo.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private Date doj;
	@OneToOne
	@JoinColumn(name = "aadharId")
	private Aadhar aadhar;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "emp")
	private List<Vehical> vehicals = new ArrayList<>();
	
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
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	public List<Vehical> getVehicals() {
		return vehicals;
	}
	public void setVehicals(List<Vehical> vehicals) {
		this.vehicals = vehicals;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", doj=" + doj + ", aadhar=" + aadhar.getAadharId() + "]";
	}
	
	
}
