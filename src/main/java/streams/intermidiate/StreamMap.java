package streams.intermidiate;

import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		Stream.of("3", "4", "5")
			.map(Integer::parseInt)
			.map(x -> x + 10)
			.forEach(System.out::println);
		
		
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9 ,10)
			.map(x -> x * 2)
			.forEach(System.out::print);
	}
}
