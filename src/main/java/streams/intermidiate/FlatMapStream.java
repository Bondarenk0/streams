package streams.intermidiate;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapStream {
	public static void main(String[] args) {
		Arrays.stream("some words for testing".split(" "))
			.flatMap(word -> Arrays.stream(word.split("")))
			.forEach(System.out::println);	
	}    
}
