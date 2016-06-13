package pragmatic.java.october.homework3_4;

import java.util.Scanner;

public class BookStoreDemo {

	public static void main(String[] args) {		
		
		BookStore store = new BookStore(5);
		
		try { 
			store.addBook(new Book("Book title 1", 10, 12.3));		
			store.addBook(new Book("Book title 2", 20, 15.6));
			store.addBook(new Book("Book title 3", -10, 22.3));
		} catch(BookStoreException e) {
			System.out.println("No more availabe space");
		}
		
		Book b = store.searchBook("Book title 2");
		if (b != null) {
			System.out.println("Price is: " + b.getPrice());
		}
		else {
			System.out.println("No such book");
		}
		
		store.sellBook("Book title 1");
		
		store.printAllBooks();
	}
}
