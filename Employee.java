/*
 * 1.	Design a class hierarchy rooted in the class Employee that includes subclasses for HourlyEmployee and SalaryEmployee. 

The attributes shared in common by these classes include the name, and job title of the employee, plus the setter and getter methods, and constructors. 

The salaried employees need an attribute for weekly salary, and the corresponding methods for accessing and changing this variable. 
The hourly employees should have a pay rate and an hours worked variable. 

There should be an abstract method called calculatePay(), defined abstractly in the superclass and implemented in the subclasses. 

The salaried worker's pay is just the weekly salary. Pay for an hourly employee is simply hours worked times pay rate

Write a TestEmployee class to test your functionalities.

 */
package com.InheritanceInterface.bll;

public abstract class Employee {
	private String name;
	private String jobTitle;
	
	public Employee() {
		
	}
	
	public Employee(String name, String jobTitle) {
		this.name=name;
		this.jobTitle=jobTitle;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void getJobTitle1() {
		this.jobTitle = jobTitle;
	}
	
	public abstract double calculatePay();
	
	@Override
	public String toString() {
		return "Employee [Name=" + name + ", Job Title=" + jobTitle + "]";
	} 

}