package net.antra.sep.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.antra.sep.pojo.Book;
import net.antra.sep.pojo.Cart;
import net.antra.sep.service.BookService;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String isbn = req.getParameter("isbn");
		Cart cart = (Cart)req.getSession().getAttribute("shoppingCart");
		BookService service = new BookService();
		Book book = service.getBookByIsbn(isbn);
		cart.add( book);
		resp.sendRedirect("main");
	}
	
}
