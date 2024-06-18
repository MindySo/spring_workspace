package spring_web01;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 서블릿 : HttpServlet

// annotation 또는
//@WebServlet("/hello.do")

// web.xml 둘 중에 하나로

public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().append("<h3>Hello Servlet</h3>");
	}
}
