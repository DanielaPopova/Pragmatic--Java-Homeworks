import java.util.Scanner;

public class Problem5_ConvertDecToBase7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer decNum = input.nextInt();
		
		System.out.println(Integer.toString(decNum, 7));
		
		
	}
}
