package streams.intermidiate;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinct {
	//method distinct reduces all doubles
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("aa", "bb", "cc", "a", "b", "c", "a", "bb");
		System.out.println(strings.distinct().collect(Collectors.toList()));
	}
}
