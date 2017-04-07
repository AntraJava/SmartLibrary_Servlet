package net.antra.sep.service;

import java.util.ArrayList;
import java.util.List;

import net.antra.sep.pojo.Book;

public class BookService {

	public List<Book> getBooks() {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Beartown","978-1501160769","Fredrik",10D));
		bookList.add(new Book("Spring in Action","978-1617291203","Craig",30.82D));
		bookList.add(new Book("Head First Servlets","978-0596516680","Bryan",40.15D));
		return bookList;
	}

}
