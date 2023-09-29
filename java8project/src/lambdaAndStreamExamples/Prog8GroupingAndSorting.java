package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Person1 {
    int age;
    String name;
    // Constructor and getters
    
	public int getAge() {
		return age;
	}
	public Person1(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person1 [age=" + age + ", name=" + name + "]";
	}
	
    
}
public class Prog8GroupingAndSorting {

	public static void main(String[] args) {
		List<Person1> people = Arrays.asList(
			    new Person1("Alice", 25),
			    new Person1("Bob", 30),
			    new Person1("Charlie", 25),
			    new Person1("David", 35)
			);
			Map<Integer, List<Person1>> ageGroups = people.stream()
			    .collect(Collectors.groupingBy(Person1::getAge));
			System.out.println(ageGroups);
			
			List<Person1> sortedPeople = people.stream()
				    .sorted(Comparator.comparing(Person1::getName))
				    .collect(Collectors.toList());
			System.out.println(sortedPeople);



	}

}
