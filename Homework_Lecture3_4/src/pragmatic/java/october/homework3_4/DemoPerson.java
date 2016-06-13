package pragmatic.java.october.homework3_4;

public class DemoPerson {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Georgi";
		person1.surname = "Mochev";
		person1.friend = new Person();
		person1.friend.name = "Ivan";
		person1.friend.height = 192;
		
		Person person2 = new Person();
		person2.name = "Kosta";
		person2.family = new Person();
		person2.family.name = "Maria";	
		person2.family.age = 26;
		
		System.out.println("The family name of " + person1.name + " is " + person1.surname);
		System.out.println("Georgi's friend " + person1.friend.name + " is " + person1.friend.height + "cm tall.");
		
		System.out.println(person2.name + "'s sister is " + person2.family.name + " and she is " + person2.family.age + " years old.");
		
	}
}
