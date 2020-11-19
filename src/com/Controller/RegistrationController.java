package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.EmployeeDao;
import com.bean.Employee;


@WebServlet("/EmployeeController")
public class RegistrationController extends HttpServlet {
	Employee employee=new Employee();
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//int id=Integer.parseInt(request.getParameter("id"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		
		//employee.setId(id);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setDob(dob);
		EmployeeDao employeeDao=new EmployeeDao();
		int ins=employeeDao.Registration(employee);
		if(ins>0) {
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
		}
}
