package streams.intermidiate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapStream {
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5)
			.flatMapToInt(x -> IntStream.rangeClosed(1, x))
			.forEach(System.out::println);	
	}    
}
