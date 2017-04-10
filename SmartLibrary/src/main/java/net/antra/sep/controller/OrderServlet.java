package net.antra.sep.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.antra.sep.pojo.Book;
import net.antra.sep.pojo.Cart;
import net.antra.sep.service.BookService;

@WebServlet("/placeOrder")
public class OrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		req.setAttribute("orderNum", 87654321);
		req.getRequestDispatcher("/WEB-INF/confirm.jsp").forward(req, resp);
		Cart cart = (Cart)req.getSession().getAttribute("shoppingCart");
		if(cart!=null){
			cart.clear();
		}
	}
	
}
