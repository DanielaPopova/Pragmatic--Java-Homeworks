package pragmatic.java.october.homework3_4;

public class Book {    //immutable?
	
	private String title;
	private int quantity;	
	private double price;
		
	public Book(String title, int quantity, double price) {
		super();
		this.title = title;		
		this.price = price;		
		//this.quantity = (quantity >= 0 ? quantity : 0);
		
		setQuantity(quantity);     //mojem da slojim quantity v dr klas, naprimer BookStock s Book b i int quantiti
	}
	
	public double getPrice () {		
		return price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity( int newQuantity) {
		quantity = (newQuantity >= 0 ? newQuantity : 0);
	}
	
	@Override
	public String toString() {
		return ("Title: " + title + " price: " + price + " quantity: " + quantity);
	}
//	public void showInventory() {
//		System.out.println("Title: " + "\"" + bookTitle + "\"" + "; Availability: " + bookCount);		
//	}
//	
//	public void buyBook(){		
//		bookCount--; 
//		System.out.println("Now we have " + bookCount + " left from " + bookTitle.toUpperCase());		
//	}
}
