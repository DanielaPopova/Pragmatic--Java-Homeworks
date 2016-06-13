package pragmatic.java.homework.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReversedEndOfText {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		List<String> result = new ArrayList<>();
		String line = "";
		while(!(line = sc.nextLine()).equals("END OF TEXT")) {
		    result.add(line);
		}
		
		Collections.reverse(result);
		result.toArray();
		for (String reversedLine : result) {
			System.out.println(reversedLine);
		}
	}
}
