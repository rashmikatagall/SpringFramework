package com.rashmi.springxml;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheMainClass {

	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        EmployeeDAO empdao = context.getBean("employeedao",EmployeeDAO.class);
        
        try {
			empdao.getAllEmployees();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        ((ClassPathXmlApplicationContext)context).close();

}
}
