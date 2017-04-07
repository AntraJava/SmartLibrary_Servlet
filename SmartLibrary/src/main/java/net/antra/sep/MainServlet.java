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

@WebServlet(value = {"/",""})
public class MainServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
		BookService service = new BookService();
		List<Book> bookList = service.getBooks();
		req.setAttribute("bookList", bookList);
		if(req.getSession().getAttribute("shoppingCart") == null){
			req.getSession().setAttribute("shoppingCart", new Cart());
		}
		req.getRequestDispatcher("/WEB-INF/showBooks.jsp").forward(req, resp);
	}
	
}
