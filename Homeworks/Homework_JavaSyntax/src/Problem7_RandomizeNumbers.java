import java.util.Scanner;
import java.util.Random;

public class Problem7_RandomizeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		int numberOne = input.nextInt();
		int numberTwo = input.nextInt();
		
		int min = Math.min(numberOne, numberTwo);
		int max = Math.max(numberOne, numberTwo);
		
		Random random = new Random();		
		for (int i = min; i <= max; i++) {
			int result = random.nextInt((max - min) + 1) + min;
			System.out.print(result + " ");
		}
		
	}

}


