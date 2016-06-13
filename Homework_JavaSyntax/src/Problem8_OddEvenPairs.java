import java.util.Scanner;

public class Problem8_OddEvenPairs {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		String[] numbers = input.nextLine().trim().split("\\s+");
				
		
		if (numbers.length % 2 == 0) {
			for (int i = 0; i < numbers.length; i+=2) {
				
				int firstNum = Integer.parseInt(numbers[i]);
				int secondNum = Integer.parseInt(numbers[i + 1]);
				
				if (firstNum % 2 == 0 && secondNum % 2 == 0) {
					System.out.println(firstNum + ", " + secondNum + "-> both are even");
				} else if ((firstNum % 2 != 0) && (secondNum % 2 != 0)){
					System.out.println(firstNum + ", " + secondNum + " -> both are odd");
				} else {
					System.out.println(firstNum + ", " + secondNum + " -> different");
				}				
			}
		}		
		else {
			System.out.println("Invalid lenght");
		}
	}
}
