package com.demo.day2;

public class ReverseNumberNoLeadingZeros {
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
        int n = 1200;
        System.out.println(reverseNumber(n)); // Output: 21
    }
}
