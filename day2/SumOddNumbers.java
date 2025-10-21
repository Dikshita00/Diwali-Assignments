package com.demo.day2;

public class SumOddNumbers {
	
	 public static int sumOfOddNumbers(int n) {
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += 2 * i + 1; 
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int n = 5; 
	        System.out.println(sumOfOddNumbers(n));
	    }
}
