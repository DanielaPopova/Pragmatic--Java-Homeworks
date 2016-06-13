package pragmatic.java.project.controller;

import java.util.Scanner;

import pragmatic.java.project.model.*;


public class StoreController {
	
	private Scanner scan = new Scanner(System.in);
	private Book[] books;	
	
	public StoreController(int max){
		books = new Book[max];		
	}	
	
	public void printStoreMenu(){
		int userChoice;
		do{
			System.out.println("Please choose one of the folowing:");
			System.out.println("1. Find a book");
			System.out.println("2. List of the titles of all the books");
			System.out.println("3. List all the information abouth the books in stock");
			System.out.println("4. Quit"); 
			userChoice = scan.nextInt();
			
			
			switch(userChoice) {
				case 1:
					System.out.println("Enter book title to search for");
					String bookT = scan.next();
					Book bFound = getBookByTitle(bookT);
					if(bFound == null){
						System.out.println("Sorry, we don't have the book you are looking for!");
					} else {
						System.out.println(bFound.getTitle());
						System.out.println("Do you want to buy it? Y/N " );
						String choice = scan.next();
						if(choice.equals("Y") && buyBook(bFound)){
							System.out.println("You've bought the book: " + bFound.getTitle() + " for the price of: " + bFound.getPrice() + " $ ");
						}
					}
				break;
				
				case 2: 
					listTitles();
				break;
				
				case 3:
					listStock();
				break;
				
				case 4:
				default: 
					userChoice = 4;
				break;
			}
				
			
		} while(userChoice != 4);
	}	
		
	
	public void addBook(Book b) {
		for(int i = 0; i < b.getQuantity(); i++) {
			if(books[i] == null) {
				books[i] = b;
				break;
			}
			
		}
	}
	
	
	public Book getBookByTitle(String title){
		for(int i = 0; i < books.length; i++){
			if(books[i].getTitle().contains(title)){
				return books[i];
			}
		}
		
		return null;
	}
	
	public int count(int demo){		
		int count = 1;
		while(count <= demo){
			count++;
		}
		return count;
	}
	
	public boolean buyBook(Book b){ 
		if(b.getQuantity() > 0){
		return b.subtractQuantity(1);
		
		}
		return false;
	}
	
	public void listTitles(){
		for(int i = 0; i < books.length; i++){
			System.out.println(books[i].getTitle());
		}
	}
	
	public void listStock(){
		for(int i = 0; i < books.length; i++){
			System.out.println((i + 1) + ". " + books[i].getTitle() + " " + books[i].getQuantity() + " in stock " + books[i].getPrice() + " $ ");
			
		}
	}
			
}