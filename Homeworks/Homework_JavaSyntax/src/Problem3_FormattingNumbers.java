import java.util.Locale;
import java.util.Scanner;

public class Problem3_FormattingNumbers {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0'), b, c);
	}

}
