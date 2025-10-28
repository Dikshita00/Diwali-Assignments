package com.demo.day7.studentapp.main;
import java.io.*;
import java.util.*;

import com.demo.day7.studentapp.model.LowAttendanceException;
import com.demo.day7.studentapp.model.Student;


public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        
        try {
            studentList.add(new Student(1, "Amit", "CSE", 85, 91));
            studentList.add(new Student(2, "Riya", "CSE", 95, 88));
            studentList.add(new Student(3, "Vivek", "IT", 70, 76));
            studentList.add(new Student(4, "Dikshita", "CSE", 92, 95));
            studentList.add(new Student(5, "Sohan", "ME", 55, 72)); // throws exception
            studentList.add(new Student(6, "Tina", "IT", 80, 68));
            studentList.add(new Student(7, "Rohit", "EE", 65, 60));
            studentList.add(new Student(8, "Kiran", "CSE", 90, 85));
            studentList.add(new Student(9, "Neha", "IT", 78, 73));
            studentList.add(new Student(10, "Arjun", "CIVIL", 88, 82));
        } catch (LowAttendanceException e) {
            System.out.println("error" + e.getMessage());
        }

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(studentList);
            System.out.println("\n💾 Students saved successfully to 'students.dat'");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        Collections.sort(studentList);

        System.out.println("\n📋 Students sorted by attendance (high → low):");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
