package pragmatic.java.homwerokr.iostreams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileObject {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Write path");
		String line = sc.nextLine();
		File newFile = new File(line);
		System.out.println(newFile.exists());
		System.out.println(newFile.getName());
		System.out.println(newFile.getAbsolutePath());
		newFile = File.createTempFile(line.replaceAll("\\d+", ""), ".txt");
		System.out.println(newFile);				
	}
}
