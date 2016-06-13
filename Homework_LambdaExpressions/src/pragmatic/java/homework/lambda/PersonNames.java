package pragmatic.java.homework.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonNames {
	public static void main(String[] args) {
				
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("petyr"));
		persons.add(new Person("georgi"));
		persons.add(new Person("stanimir"));
		
		List<String> list = persons.stream()
							.map(Person::getName)
							.collect(Collectors.toList());
		System.out.println(list);
		
//		persons.stream()                                             //vtori nachin
//		.forEach(person -> System.out.print(person.getName() + " "));		
	}
}
