package com.demo.day4;

public class GcdLcm {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18; 
        System.out.println("GCD: " + findGCD(a, b)); 
        System.out.println("LCM: " + findLCM(a, b)); 
    }
}

