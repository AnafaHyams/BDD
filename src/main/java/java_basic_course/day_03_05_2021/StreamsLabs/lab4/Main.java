package java_basic_course.day_03_05_2021.StreamsLabs.lab4;

import java_basic_course.day_03_05_2021.common.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab4.services.EmployeesStringNameCreator;
import java_basic_course.day_03_05_2021.common.services.EmployeesListCreator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeesStringNameCreator employeesStringNameCreator = new EmployeesStringNameCreator();
        EmployeesListCreator employeesListCreator = new EmployeesListCreator();
        ArrayList<Employee> employees = employeesListCreator.createEmployeesList();

        String names = employeesStringNameCreator.createEmployeesNamesString(employees);
        System.out.println("Page 152 (lab4): Names on given list: " + names);
    }
}
