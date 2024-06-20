package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestContainer 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee employee1 =(Employee) context.getBean("employee1");
		
		employee1.setEmployeeId(432);
		employee1.setEmployeeName("Geeta Shahane");
		employee1.setEmployeeRole("Automation Test Engineer");
		employee1.setEmployeeSalary(745621.98);
		
		System.out.println(employee1.toString());
		
		
	}

}
