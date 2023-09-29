package interviewPractice;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String department;
    private double salary;

    public Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class MaxSalaryByDepartment {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
            new Employee("HR", 50000),
            new Employee("IT", 60000),
            new Employee("IT", 70000),
            new Employee("Finance", 55000),
            new Employee("HR", 52000),
            new Employee("Finance", 60000)
        );

        // Group employees by department and find the max salary in each department
        Map<String, Optional<Employee>> maxSalaryByDepartment = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))
            ));
        
     // Print the results
        maxSalaryByDepartment.forEach((department, maxSalaryEmployee) -> {
                System.out.println("Department: " + department + ", Max Salary: " + maxSalaryEmployee.get().getSalary());
        });
        
        //ORRRRRRRRRRRRRRRRRRR
        
     // Group employees by department and find the max salary in each department
//        Map<String, Double> maxSalaryByDepartment = employees.stream()
//            .collect(Collectors.toMap(
//                Employee::getDepartment,
//                Employee::getSalary,
//                Double::max
//            ));
//        // Print the results
//        maxSalaryByDepartment.forEach((department, maxSalary) -> {
//            System.out.println("Department: " + department + ", Max Salary: " + maxSalary);
//        });


        /////////////////////////////////////////
           //MAX and  MIN SALARY OF EMPLOYEES
        /////////////////////////////////////////
        
     // Using Java 8 streams to find max and min salary
        
        OptionalDouble maxSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .max();

        OptionalDouble minSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .min();

        // Print the results
        if (maxSalary.isPresent() && minSalary.isPresent()) {
            System.out.println("Max Salary: " + maxSalary.getAsDouble());
            System.out.println("Min Salary: " + minSalary.getAsDouble());
        } else {
            System.out.println("No salary data available.");
        }
        
    }
}

