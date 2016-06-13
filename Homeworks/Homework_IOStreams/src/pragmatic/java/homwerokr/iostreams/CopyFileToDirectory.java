package pragmatic.java.homwerokr.iostreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class CopyFileToDirectory {
	public static void main(String[] args) throws IOException {		
		
		File source = new File("res/copy_paste.txt");
		File destination = new File("res_problem4/copy_paste.txt");
		 
		if (!source.exists()) {				
			System.out.println("Don't forget to create the copy_paste.txt file!");//				
		} 		
		
		if (!destination.exists()) {
			Files.copy(source.toPath(), destination.toPath());			
		} else {              												//if-else, vmesto destination.deleteOnExit(), z-to inache niama da se vidi file-a
			destination.delete();
			File newDestination = new File("res_problem4/copy_paste.txt");
			Files.copy(source.toPath(), newDestination.toPath());			
		}
		
		System.out.println("The file is copied");
		
		System.out.println("Is the first file deleted? " + "\n" + source.delete());
		
	}
}
