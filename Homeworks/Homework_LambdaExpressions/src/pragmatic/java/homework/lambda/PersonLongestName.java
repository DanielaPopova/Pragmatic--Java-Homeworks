package pragmatic.java.homework.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PersonLongestName {
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("petyr"));
		persons.add(new Person("stanimir"));
		persons.add(new Person("georgi"));
		
		Comparator<Person> c = (person1, person2) -> Integer.compare(person2.getName().length(), (person1.getName().length()));
	 
		Optional<Person> result = persons.stream()
				.sorted(c)
				.findFirst();
		
		System.out.println(result.get().getName() + ": " + result.get().getName().length());
		
//		if (result.isPresent()) {
//			System.out.println(result.get().getName());
//		} else {
//			System.out.println("There are names with equal length");
//		}		
	}
}
