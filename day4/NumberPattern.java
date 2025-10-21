package com.demo.day4;

public class NumberPattern {
    public static void printTriangle(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r = 5; 
        printTriangle(r);
    }
}

