package tasks;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

	public static void main(String[] args) {
		/*1) сгенерировать стрим  из 100 объектов Person
		2)отсортировать по полю
		3) получить строку из фамилий всех людей , разделенных запятыми*/
		Task3 task3 = new Task3();
		String concatenatedNames = Stream.<Person>generate(() -> {
				Person p = task3.new Person();
				p.setFirstName("firstName" + (Math.random() * 1000));
				p.setLastName("firstName" + (Math.random() * 1000));
				return p;})
			.limit(100)
			.sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
			.map(p -> p.firstName)
			.collect(Collectors.joining(" , "));
		System.out.println(concatenatedNames);
			
	}

	public class Person {
		private String firstName;
		private String lastName;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}
}
