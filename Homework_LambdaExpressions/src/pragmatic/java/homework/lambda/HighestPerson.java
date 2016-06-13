package pragmatic.java.homework.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestPerson {
	public static void main(String[] args) {
		
		Person person1 = new Person("petyr", 175);
		Person person2 = new Person("georgi", 180);
		Person person3 = new Person("stanimir", 191);
		
		Map<String, Integer> persons = new HashMap<>();
		persons.put(person1.getName(), person1.getHeight());
		persons.put(person2.getName(), person2.getHeight());
		persons.put(person3.getName(), person3.getHeight());
		
		
	}
}
