package com.coforge.githubJavaEx.dao;

import com.coforge.githubJavaEx.beanClass.Employee;

public interface EmployeeDao {
public void addEmp();
public void displayEmp();
default public void updateEmployee(){
	System.out.println("For Backward Compatability ");
}//Backward Compatability
}
