package pragmatic.java.october.homework5.problem2;

public abstract class Vertebra extends MulticellularOrganism {  /*Grybnachni*/
	
	public void move() {
		System.out.println("On the move!");
	}
	
	public void feed() {
		System.out.println("Lunch time!");
	}
	
	public void createCellStructure(){
		System.out.println("in progress...");
	}
	
	public void remember() {
		System.out.println("remembering");
	}
	
	public abstract void communicate(/*Vertebra otherVertebra*/);
}
