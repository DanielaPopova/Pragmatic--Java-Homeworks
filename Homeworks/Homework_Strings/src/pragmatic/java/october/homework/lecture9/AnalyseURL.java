package pragmatic.java.october.homework.lecture9;

import java.util.Scanner;
import java.util.regex.*;

public class AnalyseURL {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter URL:");
		String url = sc.nextLine();
		
		String regex = "(https*):\\/\\/([www.]*[\\w\\d]+.z\\w*)(\\/[\\d\\w\\/]+)\\?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(url);
		while (matcher.find()) {
			System.out.print("Protocol = " + matcher.group(1) + "\n" + "Server = " + matcher.group(2) + "\n" + "Resource = " + matcher.group(3));
		}		
	}
}
