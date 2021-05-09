package java_basic_course.day_03_05_2021.StreamsLabs.lab4;

import java_basic_course.day_03_05_2021.StreamsLabs.lab4.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab4.services.EmployeesStringNameCreator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeesStringNameCreator employeesStringNameCreator = new EmployeesStringNameCreator();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Hirsh"));
        employees.add(new Employee("Avishay"));
        employees.add(new Employee("Hadas"));

        String names = employeesStringNameCreator.createEmployeesNamesString(employees);
        System.out.println("Page 152 (lab4): Names on given list: " + names);
    }
}
