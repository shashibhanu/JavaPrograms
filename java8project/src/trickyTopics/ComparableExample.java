package trickyTopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
    	// Compare persons based on their ages logic 1
    	if(this.age>otherPerson.age)
    		return 1;
    	else
    		return -1;
    	// Compare persons based on their ages logic 2
        //return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting the list of people based on their ages (using Comparable)
        Collections.sort(people);

        // Printing the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

