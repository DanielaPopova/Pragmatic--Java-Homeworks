import java.util.Scanner;
import java.util.regex.*;

public class Problem10_ExtractWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inputText = sc.nextLine();
		
		Pattern wordsOnly = Pattern.compile("[A-Za-z]{2,}");
		Matcher matcher = wordsOnly.matcher(inputText);
		
		while (matcher.find()) {
			System.out.print(matcher.group() + " ");			
		}

	}

}

