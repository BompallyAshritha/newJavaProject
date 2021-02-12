package com.coforge.githubJavaEx.dao;

import java.io.InputStream;
import java.util.Scanner;

import com.coforge.githubJavaEx.beanClass.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private Employee e=null;
	Scanner sc=new Scanner(System.in);
	public EmployeeDaoImpl(){
		e=new Employee();
	}
	public void addEmp(){
		
		e.setEmpId(sc.nextInt());
		e.setEmpName(sc.next());
		e.setEmpPhone(sc.nextLong());
		e.setEmpEmail(sc.next());
		
	}
	
	public void displayEmp(){
		System.out.println("Employee Details:");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpPhone());
		System.out.println(e.getEmpEmail());
	}
}
