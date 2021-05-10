package java_basic_course.day_03_05_2021.StreamsLabs.lab5;

import java_basic_course.day_03_05_2021.StreamsLabs.lab5.services.EmployeesSortedStringNamesCreator;
import java_basic_course.day_03_05_2021.common.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeesSortedStringNamesCreator employeesSortedStringNamesCreator = new EmployeesSortedStringNamesCreator();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Hirsh"));
        employees.add(new Employee("Avishay"));
        employees.add(new Employee("Hadas"));

        List<String> sortedNames = employeesSortedStringNamesCreator.createSortedEmployeesNamesString(employees);
        System.out.println("Page 153 (lab5): Sorted names on given list: " + sortedNames);
    }
}
