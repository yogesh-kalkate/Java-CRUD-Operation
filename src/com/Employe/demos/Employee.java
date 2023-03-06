package com.Employe.demos;

import java.lang.reflect.Constructor;

//simply we create employee class and declared variable

public class Employee {

	int employeno;
	String employename;
	int Salary;
	
	//we intialise varible using constructor 
	//when developer called constructor we get value which we initialise
	
	public Employee() {
		
	}
	
	public Employee(int empno,String ename,int sal)
	{
		employeno = empno;
		employename = ename;
		Salary = sal;
	}

	
	public int getEmployeno() {
		return employeno;
	}


	public void setEmployeno(int employeno) {
		this.employeno = employeno;
	}

	
	public String getEmployename() {
		return employename;
	}

	
	public void setEmployename(String employename) {
		this.employename = employename;
	}

	
	public int getSalary() {
		return Salary;
	}

	
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public String toString()
	{
		return employeno+" "+employename+" "+Salary;
	}
	
	//TO PERFORM MENU DRIVEN WE CREATE NEW CLASS 
}
