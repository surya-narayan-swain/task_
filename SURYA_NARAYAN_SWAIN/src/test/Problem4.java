package test;

import java.util.*;

	public class Problem4 {
	    public static void main(String[] args) {
	        // Input list
	        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

	        // Initialize map for divisors 1 to 9
	        Map<Integer, Integer> countMap = new LinkedHashMap<>();
	        for (int i = 1; i <= 9; i++) {
	            countMap.put(i, 0);
	        }
	        // Count how many numbers are divisible by each of 1-9
	        for (int num : numbers) {
	            for (int divisor = 1; divisor <= 9; divisor++) {
	                if (num % divisor == 0) {
	                    countMap.put(divisor, countMap.get(divisor) + 1);
	                }
	            }
	        }
          // Print the result
	        System.out.println("Output:");
	        for (int i = 1; i <= 9; i++) {
	            System.out.println(i + ": " + countMap.get(i));
	        }
	    }
	}

