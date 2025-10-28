package com.demo.day5;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int n = nums.length;
        k = k % n; 

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        System.out.println("Rotated Array: " + Arrays.toString(result));
    }

}
