package com.demo.day5;

public class Employee {
    private String empName;
    private int empID;
    private String empRole;

    public Employee() {
        this.empID = 999;
        this.empName = "New Joiner";
        this.empRole = "Trainee";
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Software Developer"; 
    }

    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    public void displayDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + 
               ", Name: " + empName + 
               ", Role: " + empRole;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Dikshita");
        Employee e3 = new Employee(102, "Vivek", "Manager");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
