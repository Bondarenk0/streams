package streams.intermidiate;

import java.util.stream.IntStream;

public class SortedStream {
	public static void main(String[] args) {
		IntStream positiveInt = IntStream.rangeClosed(1, 10);
		IntStream negativeInt = IntStream.rangeClosed(-10, 0);
		IntStream.concat(positiveInt, negativeInt)
				.sorted().forEach(System.out::println);
				
	}
}
