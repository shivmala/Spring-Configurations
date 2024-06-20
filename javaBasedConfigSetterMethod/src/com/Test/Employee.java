package com.Test;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + "]";
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	

}
