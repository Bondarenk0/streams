package tasks;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
	/*Stream.generate(()-> UUID.randomUUID().toString()).limit(100) 
	1) ������������ �������
	2) ����������� �������
	3) ��� ������� �������� �������� ������ ������ � �������� ����� ���-�� ����������, � ����� ������ �������� 
	�� ������ ����, ��� ���� - ������ ������, �������� - ���-�� ��������� � ����� ������ ��������
	4) ���-�� ���������� ������ ��������*/
	public static void main(String[] args) {
		//1) ������������ �������
		Optional<String> max = Stream.generate(()-> UUID.randomUUID().toString())
			.limit(100)
			.max((uuid1, uuid2) -> uuid1.compareTo(uuid2));
		System.out.println(max.orElse("null"));
		
		//2) ����������� �������
		Optional<String> min = Stream.generate(()-> UUID.randomUUID().toString())
				.limit(100)
				.max((uuid1, uuid2) -> uuid2.compareTo(uuid1));
			System.out.println(min.orElse("null"));
			
		//3) ��� ������� �������� �������� ������ ������ � �������� ����� ���-�� ����������, � ����� ������ �������� 
			//�� ������ ����, ��� ���� - ������ ������, �������� - ���-�� ��������� � ����� ������ ��������	
		Stream.generate(()-> UUID.randomUUID().toString())
				.limit(100)
				.collect(Collectors.)
			
	}
}
