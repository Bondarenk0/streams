package streams.intermidiate;

import streams.creation.CreationOfStream;

public class StreamFilter {
	//filters stream and returns filtered stream
	public static void main(String[] args) {
		CreationOfStream.createStreamFromCollection()
			.filter(x -> x  > 5).forEach(System.out::print);
	}
}
