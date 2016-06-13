import java.util.Scanner;

public class Problem2_TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aX = input.nextInt();
		int aY = input.nextInt();
		int bX = input.nextInt();
		int bY = input.nextInt();
		int cX = input.nextInt();
		int cY = input.nextInt();
		
		float area = (aX*(bY - cY) + bX*(cY - aY) + cX*(aY - bY)) / 2f;
		area = Math.abs(area);
		
		System.out.println(Math.round(area));
	}

}
