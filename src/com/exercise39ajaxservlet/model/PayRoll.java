package com.exercise39ajaxservlet.model;
import com.exercise39ajaxservlet.model.Employee;
public class PayRoll {
	public static double CalculateSalary(Employee myEmployee) {
		return myEmployee.getSalaryEmployee()*1.30;
	}
}
