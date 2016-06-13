import java.util.Locale;
import java.util.Scanner;

public class Problem8_GetAverage {
	
	private static float getAverage(float a, float b, float c){
		float avr = (a + b + c) / 3f;
		return avr;
	} 
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		Scanner input = new Scanner(System.in);
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		System.out.printf("%.2f", getAverage(a, b, c));
	}

}
