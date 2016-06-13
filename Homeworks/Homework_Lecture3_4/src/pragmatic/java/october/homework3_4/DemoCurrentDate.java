package pragmatic.java.october.homework3_4;

import java.text.SimpleDateFormat;

public class DemoCurrentDate {

	public static void main(String[] args) {
		
		CurrentDate dateNow = new CurrentDate();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(dateFormat.format(dateNow.showDate()));
		
	}
}
