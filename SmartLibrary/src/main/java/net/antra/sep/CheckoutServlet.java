package net.antra.sep;

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
import net.antra.sep.service.BookService;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		BookService service = new BookService();
		List<Book> bookList = service.getBooks();
		req.setAttribute("bookList", bookList);
		Cart cart = (Cart)req.getSession().getAttribute("shoppingCart");
		if(cart == null || cart.size() < 1){
			//nothing to check out
			req.setAttribute("error", "Nothing to checkout");
			req.getRequestDispatcher("/WEB-INF/showBooks.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("/WEB-INF/checkout.jsp").forward(req, resp);
		}
		
	}
	
}
