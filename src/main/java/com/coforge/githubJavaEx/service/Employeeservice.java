package com.coforge.githubJavaEx.service;

public interface Employeeservice {
	public void addEmp();
	public void displayEmp();
	default public void updateEmployee(){
		System.out.println("For Backward Compatability ");
	}
	static public void deleteEmployee(){
		System.out.println("For Backward Compatability ");
	}
}
