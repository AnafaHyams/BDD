package java_basic_course.day_03_05_2021.StreamsLabs.lab4.services;

import java_basic_course.day_03_05_2021.StreamsLabs.lab4.model.Employee;

import java.util.ArrayList;
import java.util.Optional;

public class EmployeesStringNameCreator {
    // Lab 4:   Page 152
    public String createEmployeesNamesString(ArrayList<Employee> employees) {
        String names = employees.stream()
                .flatMap(employee -> employee.getName().lines())
                .reduce((x, y) -> x + "," + y)
                .get();

        return names;
    }
}
