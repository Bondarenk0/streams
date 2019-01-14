package streams.terminal;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceOperator {
	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(11	, 1112)
					.reduce(0, (acc , x) -> acc + x);	
		System.out.println(sum);
		
		Optional<Integer> sum2 = Stream.of(1, 2, 3, 4, 5)
			    .reduce((acc, x) -> acc + x);
			System.out.println(sum2.get());
	}
}
