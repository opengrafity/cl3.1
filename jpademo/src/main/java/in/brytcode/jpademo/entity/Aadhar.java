package in.brytcode.jpademo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	private String aadharId;
	private String address;
	private Date dob;
	@OneToOne(mappedBy = "aadhar")
	private Employee emp;
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", address=" + address + ", dob=" + dob + ", emp=" + emp.getEmpId() + "]";
	}
	
}
