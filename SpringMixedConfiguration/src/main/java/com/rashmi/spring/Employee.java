package com.rashmi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.rashmi.spring.Company;
import com.rashmi.spring.Department;

/*Employee bean constructed in beans.xml
 * Seeter injection for literals
 * Autowiring for objects
 * init and destroy method declared in beans definition part
 */
public class Employee {

	private String name;
	private int empid;
	private double salary;
	@Autowired
	@Qualifier("testDept")
	private Department dept;
	@Autowired
	private Company company;

	public void printInfo() {
		System.out.println("Printing employee info:");
		System.out.println("EmployeeName :" + this.name + " EmpId :" + this.empid + " Salary :" + this.salary
				+ " Department :" + dept.getName() + " Company :" + company.getName());

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void init()
	{
		System.out.println("The employee bean constructed!");
	}
	
	public void destroy()
	{
		System.out.println("The employee bean destroyed :(");
	}

}
