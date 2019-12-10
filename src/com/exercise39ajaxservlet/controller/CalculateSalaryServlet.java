package com.exercise39ajaxservlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise39ajaxservlet.model.Employee;
import com.exercise39ajaxservlet.model.PayRoll;
/**
 * Servlet implementation class CalculateSalaryServlet
 */
@WebServlet("/CalculateSalaryServlet")
public class CalculateSalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset = 'utf-8'");
		PrintWriter output = response.getWriter();
		Employee myEmployee = new Employee();
		double calculateSalary = 0.0;
		myEmployee.setNameEmployee(request.getParameter("txtName"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalary")));
		
		calculateSalary = PayRoll.CalculateSalary(myEmployee);
		output.append("Calculate Salary is" + calculateSalary);
		output.append("Estamos en el servlet");
		output.close();
	}

}
