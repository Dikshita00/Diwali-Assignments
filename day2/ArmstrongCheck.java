package com.demo.day2;

public class ArmstrongCheck {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        
        return sum == original;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n)); // Output: true
    }
}

