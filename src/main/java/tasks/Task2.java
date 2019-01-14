package tasks;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
	/*Stream.generate(()-> UUID.randomUUID().toString()).limit(100) 
	1) максимальный элемент
	2) минимальный элемент
	3) Для каждого элемента получить первый символ и подсчить общее кол-во элеменотов, с таким первым символом 
	на выходе мапа, где ключ - первый символ, значение - кол-во элементов с таким первым символом
	4) Кол-во уникальных первых символов*/
	public static void main(String[] args) {
		//1) максимальный элемент
		Optional<String> max = Stream.generate(()-> UUID.randomUUID().toString())
			.limit(100)
			.max((uuid1, uuid2) -> uuid1.compareTo(uuid2));
		System.out.println(max.orElse("null"));
		
		//2) минимальный элемент
		Optional<String> min = Stream.generate(()-> UUID.randomUUID().toString())
				.limit(100)
				.max((uuid1, uuid2) -> uuid2.compareTo(uuid1));
			System.out.println(min.orElse("null"));
			
		//3) Для каждого элемента получить первый символ и подсчить общее кол-во элеменотов, с таким первым символом 
			//на выходе мапа, где ключ - первый символ, значение - кол-во элементов с таким первым символом	
		Stream.generate(()-> UUID.randomUUID().toString())
				.limit(100)
				.collect(Collectors.)
			
	}
}
