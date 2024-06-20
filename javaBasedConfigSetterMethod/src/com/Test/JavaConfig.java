package com.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
    @Bean(name="employee1")
	public Employee getEmlpoyee()
	{
		return new Employee();
	}
    
}
