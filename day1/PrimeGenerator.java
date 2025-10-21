package com.demo.day1;

import java.util.*;

public class PrimeGenerator {
    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(i);
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 50; 
        System.out.println(generatePrimes(n));
    }
}

