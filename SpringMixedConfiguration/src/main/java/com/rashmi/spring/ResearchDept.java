package com.rashmi.spring;

import org.springframework.context.annotation.Primary;
/*
 * Bean constructed in beans.xml
 * Constructor injection
 */
public class ResearchDept implements Department {

	private int deptid;
	private String name;
	
	public ResearchDept(int deptid, String name) {
		this.deptid = deptid;
		this.name = name;
	}

	public void displayDeptInfo() {
		
		System.out.println("Research Department");

	}


	public String getName() {
		return name;
		
	}

}
