package com.utilityplus.library;

/**
 * A comprehensive utility class for mathematical operations.
 * This class provides various methods for common mathematical calculations
 * including arithmetic operations, statistical functions, and number utilities.
 * 
 * <p>All methods in this class are static and thread-safe.</p>
 * 
 * @author Utility Plus Library Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class MathUtils {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using Euclidean algorithm.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of a and b
     * @throws IllegalArgumentException if both numbers are zero
     */
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Both numbers cannot be zero");
        }
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculates the least common multiple (LCM) of two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the LCM of a and b
     * @throws IllegalArgumentException if either number is zero
     */
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Numbers cannot be zero");
        }
        return Math.abs(a * b) / gcd(a, b);
    }

    /**
     * Checks if a number is prime.
     * 
     * @param n the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     * 
     * @param n the non-negative integer
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Calculates the nth Fibonacci number.
     * 
     * @param n the position in the Fibonacci sequence (non-negative)
     * @return the nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Calculates the average of an array of numbers.
     * 
     * @param numbers the array of numbers
     * @return the average value
     * @throws IllegalArgumentException if array is null or empty
     */
    public static double average(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    /**
     * Finds the maximum value in an array of numbers.
     * 
     * @param numbers the array of numbers
     * @return the maximum value
     * @throws IllegalArgumentException if array is null or empty
     */
    public static double max(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in an array of numbers.
     * 
     * @param numbers the array of numbers
     * @return the minimum value
     * @throws IllegalArgumentException if array is null or empty
     */
    public static double min(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Calculates the sum of an array of numbers.
     * 
     * @param numbers the array of numbers
     * @return the sum of all numbers
     * @throws IllegalArgumentException if array is null
     */
    public static double sum(double[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Calculates the standard deviation of an array of numbers.
     * 
     * @param numbers the array of numbers
     * @return the standard deviation
     * @throws IllegalArgumentException if array is null or has less than 2 elements
     */
    public static double standardDeviation(double[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        double avg = average(numbers);
        double sumOfSquares = 0;
        for (double num : numbers) {
            sumOfSquares += Math.pow(num - avg, 2);
        }
        return Math.sqrt(sumOfSquares / numbers.length);
    }

    /**
     * Rounds a number to a specified number of decimal places.
     * 
     * @param value the number to round
     * @param decimalPlaces the number of decimal places
     * @return the rounded number
     * @throws IllegalArgumentException if decimalPlaces is negative
     */
    public static double round(double value, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Decimal places cannot be negative");
        }
        double factor = Math.pow(10, decimalPlaces);
        return Math.round(value * factor) / factor;
    }

    /**
     * Checks if a number is even.
     * 
     * @param n the number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     * 
     * @param n the number to check
     * @return true if the number is odd, false otherwise
     */
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    /**
     * Calculates the percentage of a value relative to a total.
     * 
     * @param value the value
     * @param total the total
     * @return the percentage
     * @throws IllegalArgumentException if total is zero
     */
    public static double percentage(double value, double total) {
        if (total == 0) {
            throw new IllegalArgumentException("Total cannot be zero");
        }
        return (value / total) * 100;
    }

    /**
     * Converts degrees to radians.
     * 
     * @param degrees the angle in degrees
     * @return the angle in radians
     */
    public static double degreesToRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    /**
     * Converts radians to degrees.
     * 
     * @param radians the angle in radians
     * @return the angle in degrees
     */
    public static double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }

    /**
     * Clamps a value between a minimum and maximum.
     * 
     * @param value the value to clamp
     * @param min the minimum value
     * @param max the maximum value
     * @return the clamped value
     */
    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }
}
