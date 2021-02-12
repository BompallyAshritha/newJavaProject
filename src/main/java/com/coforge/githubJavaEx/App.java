package com.coforge.githubJavaEx;

import java.util.Scanner;

import com.coforge.githubJavaEx.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World! Hi Haiii!!!" );
    	EmployeeServiceImpl e1=new EmployeeServiceImpl();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 1 for Add emp , 2 for Dis emp:");
    	switch (sc.nextInt()) {
		case 1:e1.addEmp();
			
		
		case 2:e1.displayEmp();
		    break;

		default:System.out.println("Requesting you to Enter only 1 or 2");
			break;
		}
    }
}
