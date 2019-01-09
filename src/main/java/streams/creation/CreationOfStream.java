package streams.creation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreationOfStream {

	public static Stream<Integer> createStreamFromCollection(){
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		return list.stream();
	}
	
	public static Stream<String> createStreamFromStaticMethodOf(){
		return Stream.of("a13", "a2", "b15", "b2", "c13", "c2");
	}
	
	public static IntStream createStreamFromAnArray(){
		int[] intArray = { -11, 22, 33, 0 ,55 ,66, 77 ,88 ,99 ,120, -4};
		return Arrays.stream(intArray);
	}
	
	public static Stream<String> createStreamFromFile() throws IOException{
		return Files.lines(new File("D:\\test").toPath());
	}
	
	public static IntStream createStreamFromString() {
		String text = "It's just a simple string!";
		return text.chars();
	}
	
	public static Stream<String> createStreamFromStreamBuilder(){
		return Stream.<String>builder().add("one").add("two").add("three").add("four").add("five").build();
	}
	
	//there are few another
}
