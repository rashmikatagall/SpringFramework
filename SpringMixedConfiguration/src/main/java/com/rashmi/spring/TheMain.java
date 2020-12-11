package com.rashmi.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.registerShutdownHook();
		
		Employee emp = context.getBean("employee",Employee.class);
		emp.printInfo();
		
		

	}

}
