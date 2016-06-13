package pragmatic.java.project.model;

import java.util.UUID;

public class Product {
	
	protected String title;
	protected String author;
	protected String price;	
	protected Integer quantity;
	protected UUID id;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		if(quantity >= 0) {
			this.quantity = quantity;
		}
	}
	
	public boolean subtractQuantity(int amount) {
		
		if(quantity >= amount){
			quantity = quantity - amount;
				return true;
		} 
		return false;
		
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}		
	
}