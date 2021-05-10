package java_basic_course.day_03_05_2021.StreamsLabs.lab8.services;

import java_basic_course.day_03_05_2021.StreamsLabs.lab8.model.CompanyName;
import java_basic_course.day_03_05_2021.StreamsLabs.lab8.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompaniesEmployeesMapGenerator {
    public Map<CompanyName,List<Employee>> createCompaniesEmployeesMap(List<Employee> employees) {
        Map<CompanyName, List<Employee>> companiesEmployeesMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompanyName));
        return companiesEmployeesMap;
    }
}
