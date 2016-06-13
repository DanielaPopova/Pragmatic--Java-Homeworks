import java.util.Scanner;

public class Problem6_ConvertBase7ToDec {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String base7 = input.nextLine();
		System.out.println(Integer.valueOf(base7, 7));
	}
}
