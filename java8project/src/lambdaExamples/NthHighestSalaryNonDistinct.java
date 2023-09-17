package lambdaExamples;

import java.util.*;
import java.util.stream.Collectors;


public class NthHighestSalaryNonDistinct {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(

            new Employee(6, "Bob2", "IT", 60000) // Adding an employee with the same salary
        );

        int nth = 2; // Change this to find employees with the nth highest salary

        List<Employee> employeesWithNthHighestSalary = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort in descending order of salary
            .distinct()
            .skip(nth - 1)//We use skip(nth - 1) to skip the first n-1 employees with the highest salaries
            .limit(1)
            .collect(Collectors.toList());

        double nthHighestSalary = employeesWithNthHighestSalary.isEmpty()
                ? Double.NaN
                : employeesWithNthHighestSalary.get(0).getSalary();

        List<Employee> employeesWithSameSalary = employees.stream()
            .filter(employee -> employee.getSalary() == nthHighestSalary)
            .collect(Collectors.toList());

        if (!employeesWithSameSalary.isEmpty()) {
            System.out.println("Employees with the " + nth + "th highest salary (" + nthHighestSalary + "):");
            employeesWithSameSalary.forEach(employee -> System.out.println(employee.name));
        } else {
            System.out.println("No employees found with the " + nth + "th highest salary.");
        }
    }
}
