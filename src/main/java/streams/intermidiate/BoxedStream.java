package streams.intermidiate;

import java.util.stream.DoubleStream;

public class BoxedStream {
	public static void main(String[] args) {
		DoubleStream.of(0.1, Math.PI)
			.boxed()
			.peek(x -> System.out.println(x instanceof Double))
			.count();
	}
}
