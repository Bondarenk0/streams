package tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
	public static void main(String[] args) {
		String[][] ex = new String[][]{{"1", "t"}, {"6", "7"}, {"c", "n"}};
		List<String> list = Arrays.stream(ex)
			.flatMap(arr -> Arrays.stream(arr))
			.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list);
	}
	
	//1)получить коллекцию 1 t 6 7 c n 
}
