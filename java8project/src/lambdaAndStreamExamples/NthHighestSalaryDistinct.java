package lambdaAndStreamExamples;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int empId;
    String name;
    String dept;
    double salary;

    public Employee(int empId, String name, String dept, double salary) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class NthHighestSalaryDistinct {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "HR", 50000),
            new Employee(2, "Bob", "IT", 60000),
            new Employee(3, "Charlie", "Finance", 55000),
            new Employee(4, "David", "IT", 70000),
            new Employee(5, "Eve", "Finance", 55000) // Adding an employee with the same salary
        );

        int nth = 3; // Change this to find the nth highest salary

        List<Double> distinctSalaries = employees.stream()
            .map(Employee::getSalary)
            .distinct()
            .sorted(Comparator.reverseOrder()) // Sort in descending order
            .collect(Collectors.toList());

        if (nth <= distinctSalaries.size()) {
            double nthHighestSalary = distinctSalaries.get(nth - 1);
            System.out.println("The " + nth + "th highest salary is: " + nthHighestSalary);
        } else {
            System.out.println("There are not enough distinct salaries to find the " + nth + "th highest salary.");
        }
    }

	@Override
	public String toString() {
		return "NthHighestSalaryDistinct [toString()=" + super.toString() + "]";
	}
}