package in.brytcode.jpademo.entity.model;

public class VehicalModel {
	private String regNo;
	private String color;
	private String model;
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
		return "VehicalModel [regNo=" + regNo + ", color=" + color + ", model=" + model + "]";
	}
	
}
