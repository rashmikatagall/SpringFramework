package com.rashmi.spring;

public class TestDept implements Department {

	private int deptid;
	private String name;
	
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public void displayDeptInfo() {

		System.out.println("Test Department");
	}

	public String getName() {
		return name;
		
	}

}
