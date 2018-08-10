package com.anil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.anil.dao.LoginDao;

public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname  = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginDao obj = new LoginDao();
		if(obj.check(uname, pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			response.sendRedirect("Welcome.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
	}

	
}
