package streams.examples;


import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {
	public static void main(String[] args) {
		Map<Integer, List<String>> map = Stream.of("kit", "kot", "ko", "ok", "time", "hello")
				.collect(Collectors.groupingBy(f -> f.length() ));
				System.out.println(map);

		
		Map<Integer, Long> map1 = Stream.of("kit", "kot", "ko", "ok", "time", "hello")
		.collect(Collectors.groupingBy(f -> f.length() , Collectors.counting()));
		System.out.println(map1);
		
		Map<Object, LongSummaryStatistics> map2 = Stream.of("kit", "kot", "ko", "ok", "time", "hello")
				.collect(Collectors.groupingBy(f -> f.length() , Collectors.summarizingLong((String f) -> f.length())));
				System.out.println(map1);
	}
}
