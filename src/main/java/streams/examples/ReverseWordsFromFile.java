package streams.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsFromFile {
	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("d://1.txt"))
			.collect(Collectors.toCollection(LinkedList::new)).descendingIterator()
			.forEachRemaining(System.out::println);
	}
}
