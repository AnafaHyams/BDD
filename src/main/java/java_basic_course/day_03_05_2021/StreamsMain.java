package java_basic_course.day_03_05_2021;

import java_basic_course.day_03_05_2021.StreamsLabs.EmployeesSalariesSum;
import java_basic_course.day_03_05_2021.model.Employee;

import java.util.Arrays;
import java.util.List;

public class StreamsMain {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(51000),
                new Employee(71600),
                new Employee(35187.5),
                new Employee(47100.77),
                new Employee(62001),
                new Employee(32001),
                new Employee(42361.4));


        // Lab 1:   Page 120
        // Result need to be 341251.67
        EmployeesSalariesSum employeesSalariesSum = new EmployeesSalariesSum();
        double salarySum = employeesSalariesSum.calculateSalariesSumByStream(employees);
        System.out.println("Page 120: Employee salary sum: " + salarySum);

    }
}
