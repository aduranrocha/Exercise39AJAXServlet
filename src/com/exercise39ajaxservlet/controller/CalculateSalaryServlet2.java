package com.exercise39ajaxservlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise39ajaxservlet.model.Employee;
import com.exercise39ajaxservlet.model.PayRoll;

/**
 * Servlet implementation class CalculateSalaryServlet2
 */
@MultipartConfig
@WebServlet("/CalculateSalaryServlet2")
public class CalculateSalaryServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateSalaryServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset = 'utf-8'");
		PrintWriter output = response.getWriter();
		Employee myEmployee = new Employee();
		double calculateSalary = 0.0;
		myEmployee.setNameEmployee(request.getParameter("txtName2"));
		myEmployee.setSalaryEmployee(Double.parseDouble(request.getParameter("txtSalary2")));
		
		calculateSalary = PayRoll.CalculateSalary(myEmployee);
		// Secuencia de escape \"
		output.append("{\"Calculate Salary \" : " + calculateSalary +"}");
		//output.append("Estamos en el servlet 2");
		output.close();
	}

}
