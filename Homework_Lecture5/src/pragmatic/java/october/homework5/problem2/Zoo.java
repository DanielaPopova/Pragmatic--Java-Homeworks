package pragmatic.java.october.homework5.problem2;

public class Zoo {
	
	private Animalia[] animals;
	Animalia animal;
	
	Zoo (int maxAnimalsCount) {
		animals = new Animalia[maxAnimalsCount];
	}
	
	
	
	public void typeOfAnimal () {
		if (animal instanceof FlyingAbility) {
			System.out.println("That's a flying animal");
		} else if (animal instanceof SwimmingAbility) {
			System.out.println("That's a swimming animal");
		} else {
			if (animal instanceof Fishes) {
				System.out.println("That's a fish");
			}
			if (animal instanceof Birds) {
				System.out.println("That's a bird");
			} 
			if (animal instanceof Reptiles) {
				System.out.println("That's a reptile");
			} 
			if (animal instanceof Mammals) {
				System.out.println("That's a mammal");
			} 
		}
	}
	
	public void addAnimal(Animalia newAnimal) {
		for (int i = 0; i < this.animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = newAnimal;
				return;
			}
		}
		System.out.println("No more place in the zoo");
	}
	
	public void showAllAnimals(){
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i] + " ");
		}
	}
	
	public void moveAll() {
		for( Animalia newAnimal : animals) {
			if (newAnimal != null) {
				newAnimal.move();
			}
		}
	}
	
}
