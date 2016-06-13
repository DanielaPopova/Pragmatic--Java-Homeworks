package pragmatic.java.homework.generics.problem2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Registry<T> {
	
	private String name;	
	private int maxElementsCount;
	private Set<T> elements;
		
	public Registry(int maxElementsCount) {		
		elements = new LinkedHashSet<>(maxElementsCount);	
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}	
	
	public int getMaxElementsCount() {
		return maxElementsCount;
	}

	public void addElement(T element) {	
		
		if (elements.size() - 1 <= maxElementsCount) {              //ogranichenieto ti kuca
			elements.add(element);
		} 	
	}
	
	public void removeElement (T element) {
		if (!element.equals(null)) {                            //da maha samo syshtestvuvashti elementi, ako gi niama - syobshtenie
			elements.remove(element); 
			System.out.println("The element \"" + element + "\" is removed from the registy"); 
		} else {
			System.out.println("No such element!");
		}
	}
	
	public int showNumberOfElements() {
		System.out.print("The number of the elements in the registy is: ");
		return elements.size();
	}
	
	public void printElements() {
		elements.toArray();
		System.out.println("The elements in the registry are:");
		for (T element : elements) {
			System.out.println(element);
		}
	}
	
	@Override
	public String toString() {
		return (name + " => " + elements);
	}
}
