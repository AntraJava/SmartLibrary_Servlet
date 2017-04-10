package net.antra.sep.service;

import java.util.List;

import net.antra.sep.pojo.Book;
import net.antra.sep.repo.BookRepository;

public class BookService {

	private BookRepository br = new BookRepository();
	
	public List<Book> getBooks() {
		return br.getBooks();
	}

	public Book getBookByIsbn(String isbn) {
		
		return br.getBookByKey(isbn);
	}


}
