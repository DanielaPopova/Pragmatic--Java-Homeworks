package pragmatic.java.october.homework3_4;

public class BookStore {
	
	private Book[] books;
	
	BookStore (int maxBooksCount) {
		books = new Book[maxBooksCount];
	}
	
	public void addBook(Book b) throws BookStoreException{
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = b;
				return;
			}
		}
		
		System.out.println("No available place");
		
		throw new BookStoreException();
	}
	
	public Book searchBook(String title) {		
		for (Book b : books) {
			if (b != null && b.getTitle() == title) {
				return b;
			}
		}
		
		return null;
	}
	
	public boolean sellBook(String title) {
		Book b = searchBook(title);
		
		if (b == null || b.getQuantity() == 0) {
			return false;
		}
		
		b.setQuantity(b.getQuantity() - 1);
		return true;
	}
	
	public void removeBook(String title){
		
	}
	
	public void printAllBooks() {
		for (Book b : books) {
			if (b != null) {
				System.out.println(b);
			}
		}
			
	}
	
	
}
