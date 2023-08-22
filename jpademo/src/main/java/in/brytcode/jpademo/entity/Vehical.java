package in.brytcode.jpademo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vehical {
	@Id
	private String regNo;
	private String color;
	private String model;
	@ManyToOne
	@JoinColumn(name = "empId")
	private Employee emp;
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehical [regNo=" + regNo + ", color=" + color + ", model=" + model + "]";
	}
	
	
}
