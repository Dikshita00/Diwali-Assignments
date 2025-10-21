package com.demo.day1;

public class FibonacciSeries {
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generateFibonacci(n);
    }
}

