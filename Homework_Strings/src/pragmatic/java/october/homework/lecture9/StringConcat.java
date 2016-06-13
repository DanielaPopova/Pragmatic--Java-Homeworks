package pragmatic.java.october.homework.lecture9;

public class StringConcat {
	
	public static void main(String[] args) {
		
//		String result = "";                 //bavniat variant
//				
//		for (int i = 1; i <= 100; i++) {                   
//			result += i;				
//		}
//		System.out.println(result.replace("", " ").trim());
		
		StringBuilder result = new StringBuilder();     //avtomatichno mi prekysva s 1_000_000, prekaleno goliamo e chisloto...s 1000 niama problem
		for (int i = 1; i <= 1_000; i++) {
			result.append(i + " ");
		}
		
		System.out.println(result.toString());		
	}	
}
