package streams.examples;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceStream {
	public static void main(String[] args) {
			Integer value =  Stream.of(1, 2, 3, 5, 1, 4, 2, 1, 3, 10, -1)
				.reduce((x, y) -> x + y).get();
				System.out.println(value);
	}
}
