package streams.terminal;

import java.util.stream.IntStream;

public class ToArrayOperator {
	public static void main(String[] args) {
		int[] arr = IntStream.rangeClosed(1, 10)
				.toArray();
		System.out.println(arr);
	}
	

}
