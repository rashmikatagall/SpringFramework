package com.rashmi.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * Bean created using @Component annotation
 * annotation enabled in beans.xml - context:annotation-config
 * component scan is enabled - context:componentScan
 */
@Component
public class Company {
	
	@Value("IBM")
	private String name;
	@Value("2000")
	private int empCount;
	
	public String getName() {
		return name;
	}
	
	

}
