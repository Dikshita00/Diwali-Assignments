package com.demo.day5.employee.service;

import java.io.*;
import java.util.*;

import com.demo.day5.employee.model.Employee;

public class EmployeeService {
    private ArrayList<Employee> empList = new ArrayList<>();
    private static final String FILE_NAME = "employees.dat";

    // 1. Add Employee
    public void addEmployee(Employee e) {
        empList.add(e);
        System.out.println("Employee added successfully!");
    }

    // 2. Remove Employee by ID
    public void removeEmployee(int id) {
        boolean removed = empList.removeIf(e -> e.getEmpID() == id);
        System.out.println(removed ? "Employee removed!" : "Employee not found!");
    }

    // 3. Show all Employees
    public void showAll() {
        if (empList.isEmpty()) System.out.println("⚠️ No employees found!");
        else empList.forEach(System.out::println);
    }

    // 4. Show sorted by empID
    public void showSorted() {
        if (empList.isEmpty()) {
            System.out.println("⚠️ No employees found!");
            return;
        }
        ArrayList<Employee> sortedList = new ArrayList<>(empList);
        Collections.sort(sortedList);
        sortedList.forEach(System.out::println);
    }

    // 5. Find Employee by name
    public void findByName(String name) {
        boolean found = false;
        for (Employee e : empList) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                System.out.println("✅ Found: " + e);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Employee not found!");
    }

    // 6. Save Employees to file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(empList);
            System.out.println("💾 Data saved to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load from file 
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            empList = (ArrayList<Employee>) ois.readObject();
            System.out.println("Data loaded successfully!");
        } catch (Exception e) {
            System.out.println("No saved data found!");
        }
    }
}

