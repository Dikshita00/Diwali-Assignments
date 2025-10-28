package com.demo.day5.employee.model;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {
    private int empID;
    private String empName;
    private String empRole;

    
    public Employee() {}
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    
    public int getEmpID() { return empID; }
    public void setEmpID(int empID) { this.empID = empID; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public String getEmpRole() { return empRole; }
    public void setEmpRole(String empRole) { this.empRole = empRole; }

    
    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-15s | Role: %s", empID, empName, empRole);
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.empID, other.empID);
    }
}
