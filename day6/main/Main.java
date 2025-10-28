package com.demo.day6.main;

import java.util.Scanner;

import com.demo.day6.study.Calculator;
import com.demo.day6.study.WrongOperatorException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            String op = sc.next();

            int result = Calculator.calculate(n1, n2, op);
            System.out.println("Result = " + result);

        } catch (WrongOperatorException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
        sc.close();
    }
}

