package in.brytcode.jpademo.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import in.brytcode.jpademo.entity.Aadhar;
import in.brytcode.jpademo.entity.ODC;

public class EmployeeModel {
	private int empId;
	private String empName;
	private Date doj;
	private Aadhar aadhar;
	private List<VehicalModel> vehicals = new ArrayList<>();
	private ODC odc;
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
	public List<VehicalModel> getVehicals() {
		return vehicals;
	}
	public void setVehicals(List<VehicalModel> vehicals) {
		this.vehicals = vehicals;
	}
	public ODC getOdc() {
		return odc;
	}
	public void setOdc(ODC odc) {
		this.odc = odc;
	}
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", empName=" + empName + ", doj=" + doj + ", aadhar=" + aadhar
				+ ", vehicals=" + vehicals + ", odc=" + odc + "]";
	}
	
}
