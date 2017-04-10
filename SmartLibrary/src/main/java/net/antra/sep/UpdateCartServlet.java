package net.antra.sep;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.antra.sep.exception.InvalidUpdateException;
import net.antra.sep.pojo.Book;
import net.antra.sep.pojo.Cart;
import net.antra.sep.service.BookService;

@WebServlet("/updateCart")
public class UpdateCartServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String isbn = req.getParameter("isbn");
		String newQuantity = req.getParameter("newValue_"+isbn);
		try{
			int newQty = Integer.parseInt(newQuantity);
			Cart cart = (Cart)req.getSession().getAttribute("shoppingCart");
			cart.update(isbn,newQty);
		}catch(ArithmeticException | InvalidUpdateException e){ e.printStackTrace();}
		
		resp.sendRedirect("checkout");
	}
	
}
