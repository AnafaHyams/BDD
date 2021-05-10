package java_basic_course.day_03_05_2021.common.services;

import java_basic_course.day_03_05_2021.common.model.Employee;

import java.util.ArrayList;

public class EmployeesListCreator {
    public ArrayList<Employee> createEmployeesList() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Hirsh"));
        employees.add(new Employee("Avishay"));
        employees.add(new Employee("Hadas"));

        return employees;
    }
}
