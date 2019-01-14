package streams.terminal;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningOperator {
	public static void main(String[] args) {
		String string = Stream.of("a", "b", "c", "d")
			.collect(Collectors.joining("-"));
		System.out.println(string);
	}
}
