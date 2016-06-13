package pragmatic.java.october.homework.lecture9;

import java.util.Scanner;


public class SearchSubstrings {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write some text: ");
		String text = sc.nextLine();
		
		System.out.println("Write a replacement: ");
		String replacement = sc.nextLine().toUpperCase();
		
		String regex = "<upcase>[\\s\\w\\W]+<\\/upcase>";

		String newText = text.replaceAll(regex, replacement);
		System.out.println(newText);
	}
}
