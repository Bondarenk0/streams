package streams.intermidiate;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitStream {
	public static void main(String[] args) {
		List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
			.limit(4)
			.collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> set = Stream.of(1, 11, 3, 4, 5, 6, 7, 8, 9)
				.limit(7)
				.collect(Collectors.toSet());
		System.out.println(set);
			
	}
}
