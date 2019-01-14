package streams.terminal;

import java.util.stream.IntStream;

public class CountOperator {
	public static void main(String[] args) {
		long count = IntStream.range(1, 100)
			.count();
		System.out.println(count);
	}
}
