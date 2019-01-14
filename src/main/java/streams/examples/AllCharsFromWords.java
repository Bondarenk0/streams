package streams.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class AllCharsFromWords {
	public static void main(String[] args) {
		Stream.of("some words for test".split(" "))
			.flatMap(word -> Arrays.stream(word.split("")))
			.map(character -> character.toUpperCase())
			.forEach(System.out::println);
	}
}
