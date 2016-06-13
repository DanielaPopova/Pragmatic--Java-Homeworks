package pragmatic.java.homework.generics.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElements {
	public static void main(String[] args) {
		
		Element<Number> element1 = new Element<>();
		element1.setElement(5);
		Element<Number> element2 = new Element<>();
		element2.setElement(6);		
		Element<Number> element3 = new Element<>();
		element3.setElement(10);
		Element<Number> element4 = new Element<>();
		element4.setElement(4.5);
		
		
		List<Number> group = new ArrayList<Number>(){{
			add(element1.getElemet());
			add(element2.getElemet());
			add(element3.getElemet());
			add(element4.getElemet());
		}};
		
		element1.compareTo(element2);
		
		System.out.println(group);
		
		
		
		
	}
}
