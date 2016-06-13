package pragmatic.java.homwerokr.iostreams;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class PrintSum2 {                          //tuk iskah osven da chete niakolko cifri na red, da ima i bukvi mejdu tiah, koito da ignorira, no ne uspqh da go doizmislq
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("res/print_sum2.txt"));
		sumNumbers(input);
		
	}
	
	
	static void sumNumbers (Scanner input) {
		int sum = 0;
		while (input.hasNext()) {
			int num = input.nextInt();
			sum += num;
		}
		
		System.out.println("The sum is: " + sum);
	}

}


