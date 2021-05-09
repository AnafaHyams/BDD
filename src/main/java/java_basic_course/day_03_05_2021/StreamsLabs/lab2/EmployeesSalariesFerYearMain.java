package java_basic_course.day_03_05_2021.StreamsLabs.lab2;

import java_basic_course.day_03_05_2021.StreamsLabs.lab2.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab2.services.EmployeeSalaryFerYearCalculator;

import java.util.List;

import static java.util.Arrays.asList;

public class EmployeesSalariesFerYearMain {
    public static void main(String[] args) {
        EmployeeSalaryFerYearCalculator employeeSalaryFerYearCalculator = new EmployeeSalaryFerYearCalculator();

        List<Employee> employees = (List<Employee>) asList(
                new Employee(new int[]{2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}),
                new Employee(new int[]{2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})
                );


        int employeesSalariesSum = employeeSalaryFerYearCalculator.calculateSalariesPerYear(employees);
        System.out.println("Page 122 (lab2): Employees salaries sum: " + employeesSalariesSum);
    }
}
