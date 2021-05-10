package java_basic_course.day_03_05_2021.StreamsLabs.lab7.services;

import java_basic_course.day_03_05_2021.StreamsLabs.lab7.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab7.model.Gender;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenderSumSalaryCalculator {

    // Lab 7:   Page 162
    public boolean isManEmployeesMoreExpensive(List<Employee> employees) {
        Map<Gender, Integer> genderSalaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.summingInt(Employee::getSalary)));

        boolean isManEmployeesMoreExpensive = genderSalaryMap.get(Gender.MAN) > genderSalaryMap.get(Gender.WOMEN);

        return isManEmployeesMoreExpensive;
    }
}
