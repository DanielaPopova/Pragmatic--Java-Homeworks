package pragmatic.java.project.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

public class FileService {	
	
	private final Vector<String[]> rs = new Vector<String[]>();
	private String[] oneRow;

	public Vector<String[]> readCSVfile(File dataFile) {
		try {
			BufferedReader brd = new BufferedReader(new FileReader(dataFile));
			while (brd.ready()) {
				String st = brd.readLine();
				oneRow = st.split(",");
				rs.addElement(oneRow);

			}
			brd.close();
		} catch (Exception e) {
			String errmsg = e.getMessage();
			System.out.println("File not found:" + errmsg);
		}
		return rs;
	}
}
