package io.github.sarthaka24.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;
    @Autowired
    private Department dept;
    @Autowired
    private List<Project> projects;

    public Employee() {
    }

    public Employee(int id, String name, String email, String phone, Department dept, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dept = dept;
        this.projects = projects;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", phone='" + phone + '\'' + ", dept=" + dept + ", projects=" + projects + '}';
    }
}
