package io.github.sarthaka24;

import io.github.sarthaka24.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee1 = (Employee) context.getBean("Employee 1");
        System.out.println(employee1);
    }
}
