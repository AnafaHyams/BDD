package java_basic_course.day_03_05_2021.StreamsLabs.lab6.services;

import java_basic_course.day_03_05_2021.StreamsLabs.lab6.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeesNamesSortedBySalary {

    // Lab 6:   Page 158
    public List<String> createEmployeesNamesStringSortedBySalary(List<Employee> employees) {
        List<String> employeesNamesSortedBySalary = employees.stream()
                .sorted((employee1, employee2) -> employee2.getSalary() - employee1.getSalary())
                .map(Employee::getName)
                .collect(Collectors.toList());

        return employeesNamesSortedBySalary;
    }
}
