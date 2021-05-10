package java_basic_course.day_03_05_2021.StreamsLabs.lab5;

import java_basic_course.day_03_05_2021.StreamsLabs.lab5.services.EmployeesSortedStringNamesCreator;
import java_basic_course.day_03_05_2021.common.model.Employee;
import java_basic_course.day_03_05_2021.common.services.EmployeesListCreator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeesSortedStringNamesCreator employeesSortedStringNamesCreator = new EmployeesSortedStringNamesCreator();
        EmployeesListCreator employeesListCreator = new EmployeesListCreator();
        ArrayList<Employee> employees = employeesListCreator.createEmployeesList();

        List<String> sortedNames = employeesSortedStringNamesCreator.createSortedEmployeesNamesString(employees);
        System.out.println("Page 153 (lab5): Sorted names on given list: " + sortedNames);
    }
}
