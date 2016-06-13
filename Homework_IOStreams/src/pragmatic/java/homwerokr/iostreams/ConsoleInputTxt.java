package pragmatic.java.homwerokr.iostreams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleInputTxt {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Write something:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/Dhanny/Desktop/console.input.txt"));
		
		out.println(line);
		System.out.println("Check the .txt file");
		
		out.close();
	}

}
