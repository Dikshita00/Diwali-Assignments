package com.demo.day5.employee.main;

import java.util.Scanner;

import com.demo.day5.employee.model.Employee;
import com.demo.day5.employee.service.EmployeeService;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();
        service.loadFromFile();

        int choice;
        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees (Sorted by ID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();
                    service.addEmployee(new Employee(id, name, role));
                }
                case 2 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = sc.nextInt();
                    service.removeEmployee(id);
                }
                case 3 -> service.showAll();
                case 4 -> service.showSorted();
                case 5 -> {
                    System.out.print("Enter Employee Name to search: ");
                    String name = sc.nextLine();
                    service.findByName(name);
                }
                case 6 -> service.saveToFile();
                case 7 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 7);
        sc.close();
    }
}

