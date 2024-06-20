package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestContainer 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee employee1 =(Employee) context.getBean("employee1");
		
		
		System.out.println(employee1.toString());
		
        Employee employee2 =(Employee) context.getBean("employee2");
        
        System.out.println(employee2.toString());
		
		
		
	}

}
