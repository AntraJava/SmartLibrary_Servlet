package net.antra.sep.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(value = {"/",""})
public class FrontPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		String userName = (String) req.getSession().getAttribute("userName");
		if(userName != null){
			resp.sendRedirect("main");
		}else{
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		doGet(req,resp);
	}
}
