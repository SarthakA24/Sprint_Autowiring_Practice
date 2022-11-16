package io.github.sarthaka24.domain;

public class Department {
    private int deptCode;
    private String deptName;

    public Department() {
    }

    public Department(int deptCode, String deptName) {
        this.deptCode = deptCode;
        this.deptName = deptName;
    }

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" + "deptCode=" + deptCode + ", deptName='" + deptName + '\'' + '}';
    }
}
