package com.demo.day2;

public class PalindromeCheck {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int n = 121; 
        System.out.println(isPalindrome(n)); // Output: true
    }
}

