package pragmatic.java.homework.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThreeDigitNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 5, -45,  12, 3, 569, 231, 145);
		
		Stream<Integer> result = list.stream();
		boolean isThere = result.anyMatch(i -> i > 99 && i <= 999);
		System.out.println("Are there three digit numbers in the list? " + isThere);
		
		if (isThere) {
			System.out.println("The numbers are: ");
			list.stream()
			.filter(i -> i > 99)
			.filter(i -> i <= 999)
			.forEach(i -> System.out.print(i + " "));					
		} 
	}
	
}
