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
import net.antra.sep.service.BookService;

@WebServlet("/hi")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<Strong>Hello, Welcome to SmartLibrary</Strong></br>");
		writer.append("These are the books we have now.</br></br>");
		writer.append("<table>");
		writer.append("<tr style=\"color:red\"><td>Title</td><td>Author</td><td>Price</td></tr>");
		BookService service = new BookService();
		List<Book> bookList = service.getBooks();
		for(Book book : bookList){
			writer.append("<tr><td>"+book.getTitle()+"</td><td>"+book.getAuthor()+"</td><td>"+book.getPrice()+"</td></tr>");
		}
		writer.append("</table>");
	}
	
}
