package net.antra.sep.pojo;

import java.util.HashMap;
import java.util.Map;

import net.antra.sep.exception.InvalidUpdateException;
import net.antra.sep.service.BookService;

public class  Cart {
	private Map<Book, Integer> bookAdded = new HashMap<>();
	//private Double totalPrice = 0D; // this field is not necessary. we have getter.
	
	public Double getTotalPrice() {
		return bookAdded.entrySet().stream().mapToDouble(i -> i.getValue() * i.getKey().getPrice()).sum();
	}

	public void add(Book book) {
		if(bookAdded.containsKey(book)){
			bookAdded.put(book, bookAdded.get(book)+1);
		}else{
			bookAdded.put(book,1);
		}
	}
	
	public int size(){
		int res = 0;
		res = bookAdded.values().stream().mapToInt(i->i.intValue()).sum();
		return res;
	}

	public Map<Book, Integer> getBookAdded() {
		return bookAdded;
	}

	public void setBookAdded(Map<Book, Integer> bookAdded) {
		this.bookAdded = bookAdded;
	}

	public void update(String isbn, int newQty) throws InvalidUpdateException {
		if(newQty < 0){
			throw new InvalidUpdateException("Quantity should be greater than or equal to 0");
		}
		Book book = new BookService().getBookByIsbn(isbn);
		if(newQty == 0){
			bookAdded.remove(book);
		}else{
			bookAdded.put(book, newQty);
		}
		
	}
	
}
