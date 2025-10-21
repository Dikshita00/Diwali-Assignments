package com.demo.day2;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n = 12345; 
        System.out.println(reverseNumber(n)); // Output: 54321
    }
}
