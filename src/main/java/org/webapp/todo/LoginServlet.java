package org.webapp.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어떤 url에 반응하는 서블릿인지 설정

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{//Http서블릿을 상속해야함

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");
	}
}
