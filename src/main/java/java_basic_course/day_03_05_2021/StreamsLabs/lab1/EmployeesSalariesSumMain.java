package java_basic_course.day_03_05_2021.StreamsLabs.lab1;

import java_basic_course.day_03_05_2021.StreamsLabs.lab1.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab1.services.EmployeesSalariesSum;

import java.util.List;

import static java.util.Arrays.asList;

public class EmployeesSalariesSumMain {
    public static void main(String[] args) {
        List<Employee> employees = asList(
                new Employee(51000),
                new Employee(71600),
                new Employee(35187.5),
                new Employee(47100.77),
                new Employee(62001),
                new Employee(32001),
                new Employee(42361.4));

        double employeesSalarySum = calculateEmployeeSalarySum(employees);
        System.out.println("Page 120: Employee salary sum: " + employeesSalarySum);
    }

    // Lab 1:   Page 120
    // Result need to be 341251.67
    private static double calculateEmployeeSalarySum(List<Employee> employees) {

        EmployeesSalariesSum employeesSalariesSum = new EmployeesSalariesSum();
        double salarySum = employeesSalariesSum.calculateSalariesSumByStream(employees);

        return salarySum;
    }
}
