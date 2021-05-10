package java_basic_course.day_03_05_2021.StreamsLabs.lab6;

import java_basic_course.day_03_05_2021.StreamsLabs.lab6.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab6.services.EmployeesNamesSortedBySalary;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = asList(
                new Employee("Shir", 15000),
                new Employee("Tomer", 5000),
                new Employee("Avi", 50000),
                new Employee("Michal", 3000),
                new Employee("Lilach", 35000)
        );

        EmployeesNamesSortedBySalary employeesNamesSortedBySalary = new EmployeesNamesSortedBySalary();
        List<String> employeesNames = employeesNamesSortedBySalary.createEmployeesNamesStringSortedBySalary(employees);
        System.out.println("Page 158 (lab6): Employees names sorted by salary: " + employeesNames);
    }
}
