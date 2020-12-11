package com.rashmi.springanno;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheMainClass {

	public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        EmployeeDAO empdao = context.getBean("employeeDAO",EmployeeDAO.class);
        
        try {
			empdao.getAllEmployees();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        ((AnnotationConfigApplicationContext)context).close();

}
}
