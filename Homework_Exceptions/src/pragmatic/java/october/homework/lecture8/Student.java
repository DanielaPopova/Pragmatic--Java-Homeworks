package pragmatic.java.october.homework.lecture8;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int age;	
	private String sex;
	
//	public Student(String firstName, String lastName, int age, String sex) {       //konstruktor ne mi triabva tuk
//		super();		
//		if (firstName.length() <= 12) {
//			this.firstName = firstName;
//		}
//		
//		if (lastName.length() <= 20) {
//			this.lastName = lastName;
//		}
//		
//		if (age >= 7 && age <= 18) {
//			this.age = age;
//		}
//		if (sex.equalsIgnoreCase("male") || sex.equalsIgnoreCase("female")) {
//			this.sex = sex;
//		}			
//	}
	
	public Student() {		
	}
	
	public void setFirstName(){		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter [first name]: ");
		this.firstName = input.nextLine();
		if (firstName.length() > 12) {
			throw new IllegalArgumentException("Error: First name should not be longer than 12 symbols!");
		}							
	}
	
//	public String getFirstName() {                    //tuk ne e neobhodimo da slagam this.firstName, tyi kato v metoda niama lokalna promenliva sys syshtoto ime, syotvetno niama konflikt s poleto na klasa?
//		return firstName;
//	}
	
	public void setLastName(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter [last name]: ");
		this.lastName = input.next();
		try {			
			
			if (lastName.length() > 20) {
				throw new InvalidStudentDateException("Error: Last name should not be longer than 20 symbols!");
			} 
		} catch (InvalidStudentDateException exc) {
			System.out.println(exc.getMessage());
		}
		return;
	}
//	
//	public String getLastName() {                    
//		return lastName;
//	}
//	
	public void setAge(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter [age]: ");
		this.age = input.nextInt();
		if (age < 7 || age > 18) {
			throw new IllegalArgumentException("Error: The age should be between 7 and 18!");
		}		
	}
//	
//	public int getAge(){
//		return age;
//	}
//	
	public void setSex() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter [sex]: ");
		this.sex = input.nextLine();
		if (!sex.equalsIgnoreCase("male") && !sex.equalsIgnoreCase("female")) {
				throw new IllegalArgumentException("Error: Choose male or female");
		}		
	}
//	
//	public String getSex(){
//		return sex;
//	}
//	
	@Override
	public String toString() {		
		return ("Name: " + firstName + " " + lastName + " Age: " + age + " Sex: " + sex );
	}
}
