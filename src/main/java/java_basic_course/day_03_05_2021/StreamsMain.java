package java_basic_course.day_03_05_2021;

import java_basic_course.day_03_05_2021.model.Employee;

import java.util.List;

import static java.util.Arrays.asList;

public class StreamsMain {
    public static void main(String[] args) {

        List<Employee> employees = asList(
                new Employee(51000, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(71600, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(35187.5, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(47100.77, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(62001, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(32001, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(42361.4, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}));

        List<Employee> employees2 = asList(
                new Employee(51000, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(71600, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(35187.5, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(47100.77, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(62001, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(32001, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}),
                new Employee(42361.4, new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}));

/*
        List<EmployeesContainer> containerList = List.of(EmployeesContainer.builder()
                        .employee(Employee.builder().salary(51000).salaries(new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}).build())
                        .employee(Employee.builder().salary(51000).salaries(new double[] {2.0, 1.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0}).build())
        );
*/

//        // Lab 1:   Page 120
//        // Result need to be 341251.67
//        EmployeesSalariesSum employeesSalariesSum = new EmployeesSalariesSum();
//        double salarySum = employeesSalariesSum.calculateSalariesSumByStream(employees);
//        System.out.println("Page 120: Employee salary sum: " + salarySum);

        // Lab 2:   Page 122
        // Result need to be 341251.67

        //EmployeesSalariesFerYear employeesSalariesFerYear = new EmployeesSalariesFerYear();
        //employeesSalariesFerYear.calculateSalariesPerYear(employees);

    }
}
