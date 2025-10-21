package com.demo.day2;

public class SumEvenNumbers {
    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5; 
        System.out.println(sumOfEvenNumbers(n)); 
    }
}

