package lambdaAndStreamExamples;

import java.util.function.IntPredicate;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Define an IntPredicate to check if a number is prime
        IntPredicate isPrime = num -> {
            if (num <= 1) {
                return false; // 0 and 1 are not prime
            }
            if (num <= 3) {
                return true; // 2 and 3 are prime
            }
            if (num % 2 == 0 || num % 3 == 0) {
                return false; // Multiples of 2 and 3 are not prime
            }
            // Check for prime by testing divisors from 5 onwards
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false; // If divisible by i or i + 2, not prime
                }
            }
            return true; // If no divisors found, it's prime
        };

        // Test some numbers
        int num1 = 17; // Prime
        int num2 = 12; // Not prime

        // Check if the numbers are prime using the IntPredicate
        if (isPrime.test(num1)) {
            System.out.println(num1 + " is prime.");
        } else {
            System.out.println(num1 + " is not prime.");
        }

        if (isPrime.test(num2)) {
            System.out.println(num2 + " is prime.");
        } else {
            System.out.println(num2 + " is not prime.");
        }
    }
}

