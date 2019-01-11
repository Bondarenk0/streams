package streams.intermidiate;
import java.util.function.Predicate;
import java.util.stream.Stream;

import streams.creation.CreationOfStream;

public class StreamFilter {
	//filters stream and returns filtered stream
	public static void main(String[] args) {
		//filter receive Predicate<T>
		CreationOfStream.createStreamFromCollection()
			.filter(x -> x  > 5).forEach(System.out::print);
		
		System.out.println();
		
		Stream.of(120, 410, 85, 32, 314, 12)
	    .filter(x -> x > 100)
	    .forEach(System.out::println);
	}
}
