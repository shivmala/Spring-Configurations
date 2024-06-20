package com.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
    @Bean(name="employee1")
	public Employee getEmlpoyee1()
	{
		return new Employee(200, "Sushma", "Business Analyst", 94032.21);
	}
    
	
	  @Bean(name="employee2") 
	  public Employee getEmlpoyee2() 
	  {
		  return new Employee(432, "Saurabh", "Java Developer", 8732948.56); 
		  
	  }
	 
    
}
