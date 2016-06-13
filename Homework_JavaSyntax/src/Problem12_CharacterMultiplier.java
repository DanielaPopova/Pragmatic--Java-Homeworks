import java.util.Scanner;

public class Problem12_CharacterMultiplier {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Insert two strings: ");
		 String[] input = sc.nextLine().trim().split("\\s+");
		 String str1;
		 String str2;
		 
		 if (input[0].length() > input[1].length()) {
			str1 = input[0];
			str2 = input[1];
		} else {
			str2 = input[0];
			str1 = input[1];
		}
		 
		 System.out.println(calculateSum(str1, str2));
	}
	
	private static long calculateSum (String str1, String str2) {
 		
		long sum = 0L;		
		for (int i = 0; i < str1.length(); i++) {
			if (i < str2.length()) {
				sum += str1.charAt(i) * str2.charAt(i);
			} else {
				sum += str1.charAt(i);
			}
		}
		return sum;
 	}
}

