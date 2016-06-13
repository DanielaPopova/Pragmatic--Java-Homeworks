package pragmatic.java.homework.generics.problem2;

public class RegistryDemo {
	public static void main(String[] args) {
		
		Registry<String> opit1 = new Registry<>(3);
		opit1.setName("Dani");
		
		opit1.addElement("pyrvo");
		opit1.addElement("vtoro");
		opit1.addElement("treto");
		//opit1.addElement("neshto");
		
		
		opit1.printElements();
		opit1.removeElement("treto");
		opit1.printElements();
		System.out.println(opit1.showNumberOfElements());
		System.out.println("The name is " + opit1.getName());
		
		System.out.println(opit1);
	}

}
