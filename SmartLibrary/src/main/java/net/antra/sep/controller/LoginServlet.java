package net.antra.sep.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.antra.sep.pojo.Book;
import net.antra.sep.pojo.Cart;
import net.antra.sep.pojo.User;
import net.antra.sep.service.BookService;
import net.antra.sep.service.UserService;

@WebServlet(value = {"/login"})
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String pwd = req.getParameter("password");
		User validUser = new UserService().validateUser(name, pwd);
		if(validUser != null){
			req.getSession().setAttribute("user", validUser);
			req.getRequestDispatcher("/main").forward(req, resp);
		}else{
			req.setAttribute("invalidUser", true);
			req.getRequestDispatcher("/").forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/").forward(req, resp);
	}
}
