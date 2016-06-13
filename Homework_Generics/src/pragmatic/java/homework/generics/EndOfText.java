package pragmatic.java.homework.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfText {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		List<String> collection = new ArrayList<>();
		String line = "";
		while(!(line = sc.nextLine()).equals("END OF TEXT")) {
		    collection.add(line);
		}
				
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < collection.size(); i++) {
			result.append(collection.get(i));
		}
		System.out.println(result);
		
		//System.out.println(result.toString().replaceAll("[^\\w]+", ""));		
	}
}
