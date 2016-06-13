package pragmatic.java.october.homework5.problem2;

public class Aquarium {
	
	private SwimmingAbility[] animals;
	
	Aquarium(int maxAnimalsCount) {
		animals = new SwimmingAbility[maxAnimalsCount];
	}
	
	public void addAnimal(SwimmingAbility newAnimal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = newAnimal;
				return;
			}
		}
		
		System.out.println("No more space in the aquarim");
	}
	
	public void swimAll(){
		for(SwimmingAbility newAnimal : animals){
			if (newAnimal != null) {
				newAnimal.swim();
			}
		}
	}
}   	
