package pragmatic.java.october.homework5.problem2;

public class Test {
	
	public static void main(String[] args) {
		  
//		UnicellularOrganism ameba = new Amoeba();
//		UnicellularOrganism chehylche = new Paramecium();
//		
//		Animalia test = new Amoeba();
//		test.move();
//		test.feed();
		
		Zoo sofiaZoo = new Zoo(5);
		
		Animalia mishka = new Mammals();
		sofiaZoo.addAnimal(mishka);
		Animalia croco = new Reptiles();
		sofiaZoo.addAnimal(croco);		
			
			
	}

}
