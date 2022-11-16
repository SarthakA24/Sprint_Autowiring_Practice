package io.github.sarthaka24;

import io.github.sarthaka24.domain.Department;
import io.github.sarthaka24.domain.Employee;
import io.github.sarthaka24.domain.Project;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

public class EmployeeConfig {

    @Bean("Employee 1")
    public Employee getEmployee1() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sarthak");
        employee.setEmail("sarthak@email.com");
        employee.setPhone("9999999999");
        return employee;
    }

    @Bean
    public Department getDepartment1() {
        return new Department(1, "IT");
    }

    @Bean
    public List<Project> getProjects() {
        return Arrays.asList(new Project(1, "Angular"), new Project(2, "Spring"));
    }
}
