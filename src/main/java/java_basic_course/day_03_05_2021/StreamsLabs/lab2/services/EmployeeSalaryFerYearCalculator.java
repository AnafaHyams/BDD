package java_basic_course.day_03_05_2021.StreamsLabs.lab2.services;

import java_basic_course.day_03_05_2021.StreamsLabs.lab2.model.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class EmployeeSalaryFerYearCalculator {

    // Lab 2:   Page 122
    // Result need to be 341251.67
    public int calculateSalariesPerYear(List<Employee> employees) {
        int sum = employees.stream()
                .flatMap(employee -> List.of(employee.getSalaries()).stream())
                .mapToInt(salary -> IntStream.of(salary).sum())
                .sum();

        return sum;
    }
}
