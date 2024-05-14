package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



/**
 * Smoke tests for verifying the functionality of various methods.
 */
public class SmokeTests {
    /**
     * Tests the {@code sumOfSquares} method in the {@code LoopControl} class.
     * It verifies that the method correctly calculates the sum of squares of the first 10 positive integers.
     */
    @Test
    public void testSumOfSquares() {
        // Call the method
        int actualSum = LoopControl.sumOfSquares();

        // Calculate the expected sum of squares
        int expectedSum = 1*1 + 2*2 + 3*3 + 4*4 + 5*5 + 6*6 + 7*7 + 8*8 + 9*9 + 10*10;

        // Compare the actual and expected sums
        assertEquals(expectedSum, actualSum);
    }
    /**
     * Tests the {@code matrixDiagonalSum} method in the {@code ExampleUsage} class.
     * It verifies that the method correctly calculates the sum of diagonal elements in a 3x3 matrix.
     */
    @Test
    public void testMatrixDiagonalSum() {
        // Call the method
        int actualSum = ExampleUsage.matrixDiagonalSum();

        // Define the test matrix
        int[][] testMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Calculate the expected sum of diagonal elements
        int expectedSum = testMatrix[0][0] + testMatrix[1][1] + testMatrix[2][2];

        // Compare the actual and expected sums
        assertEquals(expectedSum, actualSum);
    }

    /**
     * Tests the {@code filterAndCountEvenNumbers} method in the {@code ExampleUsage} class.
     * It verifies that the method correctly filters and counts even numbers in an array of integers.
     */
    @Test
    public void testFilterAndCountEvenNumbers() {
        // Call the method
        int actualCount = ExampleUsage.filterAndCountEvenNumbers();

        // Define the test array
        int[] testNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the expected count of even numbers
        int expectedCount = 0;
        for (int num : testNumbers) {
            if (num % 2 == 0) {
                expectedCount++;
            }
        }

        // Compare the actual and expected counts
        assertEquals(expectedCount, actualCount);
    }

}

