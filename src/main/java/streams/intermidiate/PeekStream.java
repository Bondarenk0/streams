package streams.intermidiate;

import java.util.stream.Stream;

public class PeekStream {
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6)
			.peek(System.out::println)
			.map(x -> x + 1)
			.forEach(System.out::println);
	}
}
