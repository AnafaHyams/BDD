package java_basic_course.day_03_05_2021.StreamsLabs;

import java_basic_course.day_03_05_2021.model.Employee;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeesSalariesSum {

    public double calculateSalariesSumByStream(List<Employee> employees) {

        DoubleSummaryStatistics employeesSalaryStatistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        return employeesSalaryStatistics.getSum();
    }
}
