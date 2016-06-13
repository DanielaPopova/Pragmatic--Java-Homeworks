
import java.util.Scanner;

public class Problem13_GetFirstOddEvenElements {
	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sequence of numbers: ");
		String[] input = sc.nextLine().trim().split("\\s");		
		System.out.println("Enter how many elements to be extracted");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.println("Insert [odd] or [even]");
		String type = sc.nextLine();
		
		int[] nums = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}
		
		getElements(nums, count, type);
		
		
		
		
			
		
	}
	
	private static void getElements(int[] nums, int count, String type){
		
		for (int i = 0; i <= nums.length; i++) {
			if (nums[i] % 2 != 0) {
				System.out.print(nums[i] + " ");
			
			}
			
		}
		
	}
}
