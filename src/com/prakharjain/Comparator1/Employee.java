package com.prakharjain.Comparator1;

public class Employee {
	
	private String name;
	private String dept;
	private String BU;
	
	public Employee(String name, String dept, String bU) {
		super();
		this.name = name;
		this.dept = dept;
		this.BU = bU;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	
	
}
