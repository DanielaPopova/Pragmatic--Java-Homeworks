package pragmatic.java.homework.generics;

import java.util.*;

public class IdenticalLetterRemover {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a sequence: ");
		String sequence = sc.nextLine();
		
		Set<Character> newSequence = new LinkedHashSet<>();
		for (Character ch : sequence.toCharArray()) {
			newSequence.add(ch);
		}		
		System.out.println(newSequence.toString().replaceAll("[^\\w]+", ""));		
	}

}
