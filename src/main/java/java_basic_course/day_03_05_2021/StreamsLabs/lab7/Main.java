package java_basic_course.day_03_05_2021.StreamsLabs.lab7;


import java_basic_course.day_03_05_2021.StreamsLabs.lab7.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab7.model.Gender;
import java_basic_course.day_03_05_2021.StreamsLabs.lab7.services.GenderSumSalaryCalculator;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = asList(
                new Employee(Gender.WOMEN, 15000),
                new Employee(Gender.MAN, 5000),
                new Employee(Gender.MAN, 50000),
                new Employee(Gender.WOMEN, 3000),
                new Employee(Gender.WOMEN, 35000)
        );

        GenderSumSalaryCalculator genderSumSalaryCalculator = new GenderSumSalaryCalculator();
        boolean isManEmployeesMoreExpensive = genderSumSalaryCalculator.isManEmployeesMoreExpensive(employees);
        System.out.println("Page 162 (lab7): Is man employees more expensive than women employees: " + isManEmployeesMoreExpensive);
    }
}
