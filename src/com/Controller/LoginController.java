package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.EmployeeDao;
import com.bean.Employee;


@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Employee employee=new Employee();
		employee.setUsername(username);
		employee.setPassword(password);
		EmployeeDao employeeDao=new EmployeeDao();
		employee=employeeDao.checklogin(employee);
		if(employee!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("Employee",employee);
			request.getRequestDispatcher("sucess.jsp").forward(request, response);
		}
		else {
			request.setAttribute("eror","username password not match");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.sendRedirect("Login.jsp");
		}
}
