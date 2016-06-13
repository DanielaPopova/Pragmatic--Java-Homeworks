package pragmatic.java.project.model;

public class Book extends Product{
	
	
	private String publisher;
	private String origins;	
	
	public Book() {
		
	}

	public Book (String title, String author, String price, String publisher, String origins, Integer quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.origins = origins;
		this.quantity = quantity;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getOrigins() {
		return origins;
	}

	public void setOrigins(String origins) {
		this.origins = origins;
	}

	

	
}