package com.rashmi.springanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.rashmi.springanno")
@PropertySource("classpath:application.properties")
public class Config {

}
