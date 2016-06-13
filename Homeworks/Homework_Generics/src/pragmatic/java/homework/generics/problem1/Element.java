package pragmatic.java.homework.generics.problem1;

import java.util.ArrayList;
import java.util.List;

public class Element<T> implements Comparable<Element<T>>{
	
	private T element;
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public T getElemet(){
		return this.element;
	}

	@Override
	public int compareTo(Element<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
