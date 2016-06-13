package pragmatic.java.homework.lambda;

//import java.util.Optional;
import java.util.stream.Stream;

public class PositiveNumbersSquareRoot {
	public static void main(String[] args) {
		
		Stream<Integer>	list = Stream.of(5, 2, -1, 0, -3, -6);
		list.filter(i -> i > 0)
		.map(i -> i * i)
		.forEach(i -> System.out.print(i + " "));
	}
}
