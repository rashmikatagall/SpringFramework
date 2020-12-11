package com.rashmi.springanno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class EmployeeDAO {
	
	@Value("${employeedao.driver}")
	private String driver;
	@Value("${employeedao.url}")
	private String url;
	@Value("${employeedao.name}")
	private String username;
	@Value("${employeedao.password}")
	private String password;
	private Connection connection;
    
	@PostConstruct
	public void init() throws SQLException, ClassNotFoundException
	{
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
	}


	@PreDestroy
	public void destroy() throws SQLException
	{
		connection.close();
	}
	
	public void getAllEmployees() throws ClassNotFoundException, SQLException
	{
		Statement stmt = connection.createStatement();
		ResultSet result = stmt.executeQuery("select * from employee");
	    System.out.println(" Name  :   EmpId  :  Salary");
		while(result.next())
		{
			String name = result.getString("name");
			int id = result.getInt("empid");
			double salary = result.getDouble("salary");
		    System.out.println( name +"     " + id +"         "+salary);
			
		}
	}
	
	
	


}
