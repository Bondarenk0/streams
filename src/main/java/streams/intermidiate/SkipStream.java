package streams.intermidiate;


import java.util.stream.Stream;

public class SkipStream {
	public static void main(String[] args) {
		Stream.iterate(1, x -> x + 1)
				.limit(20)
				.skip(10)
				.forEach(System.out::println);
	}
}
