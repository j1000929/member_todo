package org.webapp.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어떤 url에 반응하는 서블릿인지 설정

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{//Http서블릿을 상속해야함

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		
		String name = request.getParameter("name");
		String password =request.getParameter("password");
		System.out.println(name+","+password);
		request.setAttribute("name", name);
		request.setAttribute("password", password);
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);//
	}
}
