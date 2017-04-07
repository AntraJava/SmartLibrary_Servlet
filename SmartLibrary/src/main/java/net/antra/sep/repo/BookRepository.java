package net.antra.sep.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.antra.sep.pojo.Book;

public class BookRepository {
	private static Map<String, Book> bookRepository = new HashMap<>();
	
	static{
		bookRepository.put("978-1501160769", new Book("Beartown","978-1501160769","Fredrik",10D));
		bookRepository.put("978-1617291203", new Book("Spring in Action","978-1617291203","Craig",30.82D));
		bookRepository.put("978-0596516680", new Book("Head First Servlets","978-0596516680","Bryan",40.15D));
	}
	
	public List<Book> getBooks(){
		return new ArrayList<Book>(bookRepository.values());
	}

	public Book getBookByKey(String isbn) {
		return bookRepository.get(isbn);
	}
}
