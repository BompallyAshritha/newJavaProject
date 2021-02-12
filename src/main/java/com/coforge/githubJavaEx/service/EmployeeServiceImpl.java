package com.coforge.githubJavaEx.service;

import com.coforge.githubJavaEx.dao.EmployeeDao;
import com.coforge.githubJavaEx.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements Employeeservice{
	private EmployeeDaoImpl ed=null;
	public EmployeeServiceImpl(){
		ed=new EmployeeDaoImpl();
	}
	public void addEmp(){
		ed.addEmp();
	}
	public void displayEmp(){
		ed.displayEmp();
	}

}
