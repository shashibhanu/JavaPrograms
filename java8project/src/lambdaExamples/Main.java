package lambdaExamples;

import java.util.*;
import java.util.stream.Collectors;

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person2> people = Arrays.asList(
            new Person2("Alice", 25),
            new Person2("Bob", 30),
            new Person2("Charlie", 25),
            new Person2("David", 35)
        );

        Map<Integer, List<Person2>> ageGroups = people.stream()
            .collect(Collectors.groupingBy(Person2::getAge));

        ageGroups.forEach((age, group) -> {
            System.out.println("People aged " + age + ":");
            group.forEach(Person2 -> System.out.println(Person2.getName()));
            System.out.println();
        });
    }
}

