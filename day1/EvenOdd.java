package com.demo.day1;

public class EvenOdd {
    public static String checkEvenOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int n = 7; 
        System.out.println(checkEvenOdd(n));
    }
}

