package org.example;

public class ExampleUsage {

    /**
     * Displays even numbers from an array.
     */
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Display even numbers only
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }


    /**
     * Sums an array of integers.
     *
     * @return The sum of the array.
     */
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0; // Correct usage of variable scope
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Processes a 2D matrix.
     */
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
    /**
     * Filters and counts even numbers in an array.
     *
     * @return The count of even numbers.
     */
    public static int filterAndCountEvenNumbers() {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    /**
     * Calculates the sum of diagonal elements in a square matrix.
     *
     * @return The sum of diagonal elements.
     */
    public static int matrixDiagonalSum() {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Adding diagonal element (i, i) to the sum
        }
        return sum;
    }

}
