package java_basic_course.day_03_05_2021.StreamsLabs.lab8;

import java_basic_course.day_03_05_2021.StreamsLabs.lab7.model.Gender;
import java_basic_course.day_03_05_2021.StreamsLabs.lab8.model.CompanyName;
import java_basic_course.day_03_05_2021.StreamsLabs.lab8.model.Employee;
import java_basic_course.day_03_05_2021.StreamsLabs.lab8.services.CompaniesEmployeesMapGenerator;
import java_basic_course.day_03_05_2021.StreamsLabs.lab8.services.CompaniesNumOfEmployeesMapGenerator;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = asList(
                new Employee("Shir", new CompanyName("Facebook"), 15000),
                new Employee("Tomer", new CompanyName("Wix"), 5000),
                new Employee("Avi", new CompanyName("Microsoft"), 50000),
                new Employee("Michal", new CompanyName("RedHat"), 3000),
                new Employee("Lilach", new CompanyName("Facebook"), 35000)
        );

        CompaniesEmployeesMapGenerator companiesEmployeesMapGenerator = new CompaniesEmployeesMapGenerator();
        Map<CompanyName, List<Employee>> companiesEmployeesMap = companiesEmployeesMapGenerator.createCompaniesEmployeesMap(employees);


        CompaniesNumOfEmployeesMapGenerator companiesNumOfEmployeesMapGenerator = new CompaniesNumOfEmployeesMapGenerator();
        Map<CompanyName, Integer> companiesEmployeesCountMap = companiesNumOfEmployeesMapGenerator.createCompaniesEmployeesCountMap(companiesEmployeesMap);

        System.out.println("Page 163 (lab8): Map of companies names and number of workers:\n" + companiesEmployeesCountMap);
    }

}
