package io.github.sarthaka24.domain;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String phone;
    private Department dept;

    public Employee() {
    }

    public Employee(int id, String name, String email, String phone, Department dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", phone='" + phone + '\'' + ", dept=" + dept + '}';
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

}
