package com.exercise39ajaxservlet.model;

public class Employee {
	private String nameEmployee;
	private double salaryEmployee;
	public Employee() {
		
	}
	public Employee(String nameEmployee, double salaryEmployee) {
		this.nameEmployee = nameEmployee;
		this.salaryEmployee = salaryEmployee;
	}
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	
	public double getSalaryEmployee() {
		return salaryEmployee;
	}
	
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	
	@Override
	public String toString() {
		return "Name Employee: "+this.nameEmployee+"SalaryEmployee: "+this.salaryEmployee;
	}
}
