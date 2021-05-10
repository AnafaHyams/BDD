package java_basic_course.day_03_05_2021.StreamsLabs.lab5.services;

import java_basic_course.day_03_05_2021.common.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesSortedStringNamesCreator {
    // Lab 5:   Page 153
    // to ask: if I need to ignore name that not starts withe uppercase or it's ok to make them uppercase so I will compare them too
    public List<String> createSortedEmployeesNamesString(ArrayList<Employee> employees) {
        List<String> sortedNames = employees.stream()
                .flatMap(employee -> employee.getName().toUpperCase().lines())
                .sorted((name1, name2) -> name1.length() - name2.length())
                .collect(Collectors.toList());

        return sortedNames;
    }
}
