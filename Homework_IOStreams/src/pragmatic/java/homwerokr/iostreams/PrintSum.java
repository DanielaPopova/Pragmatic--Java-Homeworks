package pragmatic.java.homwerokr.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrintSum {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("res/print_sum.txt"));
		FileWriter writer = new FileWriter("res/print_sum_output.txt");
		
		int sum = 0;
		String line = "";
		while ((line = reader.readLine()) != null) {
			int number = Integer.parseInt(line);
			sum += number;
		}
		
		System.out.println("The sum of the numbers is: " + sum);
		writer.write(Integer.toString(sum));
		
		reader.close();
		writer.close();
	}

}
