package streams.terminal;

import java.util.stream.Stream;

public class ForEachOrderedStream {
	public static void main(String[] args) {
		Stream.of(1, 5, 7, 2, 4, 9 ,3)
			.parallel()
			.forEachOrdered(System.out::println);
	}
}
