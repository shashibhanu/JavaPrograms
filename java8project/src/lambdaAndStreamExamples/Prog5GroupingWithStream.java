package lambdaAndStreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Person {
    String city;
    String name;
    // Constructor and getters
    
	public String getCity() {
		return city;
	}
	public Person(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [city=" + city + ", name=" + name + "]";
	}
	
/*
 * Without the toString() method, the default Object.toString() method would be used, 
 * which typically prints something like Person@<hashcode>, which is not very informative.
 */
    
}
public class Prog5GroupingWithStream {

	public static void main(String[] args) {


		List<Person> people = Arrays.asList(
		    new Person("New York", "Alice"),
		    new Person("London", "Bob"),
		    new Person("New York", "Charlie")
		);

		Map<String, List<Person>> peopleByCity = people.stream()
		                                               .collect(Collectors.groupingBy(Person::getCity));
		//System.out.println(peopleByCity);
		//if you want to print the map directly with System.out then toString() method is needed above
		//or else you can use below code using forEach
		
		// Print the result
        peopleByCity.forEach((city, persons) -> {
            System.out.println("City: " + city);
            persons.forEach(person -> System.out.println("   " + person));
        });


	}

}
