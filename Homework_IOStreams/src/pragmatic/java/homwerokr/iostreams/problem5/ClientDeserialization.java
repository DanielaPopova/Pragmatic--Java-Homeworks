package pragmatic.java.homwerokr.iostreams.problem5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClientDeserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Client client1 = null;
		Client client2 = null;
		Client client3 = null;
		
		FileInputStream fileIn = new FileInputStream("res/client_serialization.ser");
		ObjectInputStream objIn = new ObjectInputStream(fileIn);
		
		try {			
			client1 = (Client)objIn.readObject();
			client2 = (Client)objIn.readObject();
			client3 = (Client)objIn.readObject();
		} finally {
			fileIn.close();
			objIn.close();
		}
		
		System.out.println(client1);
		System.out.println(client2);
		System.out.println(client3);		
	}
}
