package net.antra.sep;

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
public class Order extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		HttpSession session = req.getSession(false);
		if (session != null) {
		    session.invalidate();
		}
		resp.sendRedirect("/SmartLibrary");
	}
	
}
