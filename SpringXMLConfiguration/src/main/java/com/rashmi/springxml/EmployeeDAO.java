package com.rashmi.springxml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	private Connection connection;
    
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	public void init() throws SQLException, ClassNotFoundException
	{
		Class.forName(driver);
		connection = DriverManager.getConnection(url, username, password);
	}


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
