package pragmatic.java.homwerokr.iostreams.problem5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClientSerialization {
	
	public static void main(String[] args) throws IOException {
		
		Client client1 = new Client();
		client1.setFullName("Petyr Gorov");
		client1.setId(647956123);
		client1.setAccountNumber("3770 0154 3547 6689");
		client1.setPhone("0873 456 325");
		client1.setEmail("petyr.gorov@yahoo.com");
		client1.setAddress("Sofia, Mladost 2");
		
		Client client2 = new Client();
		client2.setFullName("Ani Ilieva");
		client2.setId(745264569);
		client2.setAccountNumber("4880 6654 7822 0054");
		client2.setPhone("0897 881 440");
		client2.setEmail("ani_ilieva@gmail.com");
		client2.setAddress("Sofia, Liulin 10");
		
		Client client3 = new Client();
		client3.setFullName("Dimo Monev");
		client3.setId(988451260);
		client3.setAccountNumber("4770 5498 2020 0053");
		client3.setPhone("0896 345 766");
		client3.setEmail("dimomoneva@abv.bg");
		client3.setAddress("Sofia, Drujba 2");
		
		FileOutputStream fileOut = new FileOutputStream("res/client_serialization.ser");
		ObjectOutputStream objOut = new ObjectOutputStream (fileOut);
		try {
			objOut.writeObject(client1);
			objOut.writeObject(client2);
			objOut.writeObject(client3);
		} finally {
			objOut.close();
			fileOut.close(); 
		}
		
		System.out.println("Serialized data is saved in res/client_serialization.ser");
	}
}
