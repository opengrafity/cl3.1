package in.brytcode.jpademo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ODC {
	@Id
	@Column(name="odc_number")
	private int number;
	private int capacity;
	private String name;	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ODC [number=" + number + ", capacity=" + capacity + ", name=" + name + "]";
	}
	
}
