package com.demo.day1;

public class LongestStringLength {
    public static int findLongestLength(String[] arr) {
        int maxLength = 0;
        for (String s : arr) {
            if (s.length() > maxLength)
                maxLength = s.length();
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "watermelon"};
        System.out.println(findLongestLength(arr));
    }
}

