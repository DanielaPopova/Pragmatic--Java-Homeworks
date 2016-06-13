import java.util.Locale;
import java.util.Scanner;

public class Problem4_CalculateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.ROOT); 
		
		Scanner input = new Scanner(System.in);
		
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double firstPartF1 = (a * a + b * b) / (a * a - b * b);		 
		double F1 = Math.pow(firstPartF1, (a + b + c)/Math.sqrt(c));
		
		double firstPartF2 = a * a + b * b - c * c * c;
		double F2 = Math.pow(firstPartF2, (a - b));
		
		double avrNumbers = (a + b + c) / 3;
		double avrFormulas = (F1 + F2) / 2;
		double difference = Math.abs(avrNumbers - avrFormulas);
		
		System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", F1, F2, difference);
		
		
	}

}
