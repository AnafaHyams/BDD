package java_basic_course.day_03_05_2021.StreamsLabs.lab8.services;

import java_basic_course.day_03_05_2021.StreamsLabs.lab8.model.CompanyName;
import java_basic_course.day_03_05_2021.StreamsLabs.lab8.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompaniesNumOfEmployeesMapGenerator {
    public Map<CompanyName, Integer> createCompaniesEmployeesCountMap(Map<CompanyName, List<Employee>> companyEmployeesMap) {
        Map<CompanyName, Integer> companyNameNumOfWorkersMap = companyEmployeesMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, company -> company.getValue().size()));
        return companyNameNumOfWorkersMap;
    }
}
