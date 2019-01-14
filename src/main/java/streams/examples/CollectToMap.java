package streams.examples;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {
	public static void main(String[] args) {
		Map<Integer, Integer> map = Stream.of(1, 2, 3, 5, 1, 4, 2, 1, 3, 10, -1)
			.collect(Collectors.toMap(
					a -> a,
					b -> 1,
					(a, b) ->  ++a));
			System.out.println(map);
	}
}
