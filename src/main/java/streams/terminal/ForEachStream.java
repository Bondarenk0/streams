package streams.terminal;

import java.util.stream.IntStream;

public class ForEachStream {
	public static void main(String[] args) {
		IntStream.range(0, 100)
			.forEach(System.out::println);
	}
}
