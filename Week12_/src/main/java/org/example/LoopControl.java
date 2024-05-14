package org.example;
/**
 * This class provides examples of common programming mistakes in loops.
 */
public class LoopControl {


    /**
     * Demonstrates incorrect variable usage where loop starts much later after declaration.
     */
    public void incorrectVariableUsage() {
        int index;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }
    /**
     * Demonstrates empty block usage by printing whether each iteration is at midpoint or not.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                System.out.println("not midpoint");
            }
        }
    }
    /**
     * Demonstrates modified control variable inside a loop, which is incorrect.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {

            if (m == 5) {
                int a=m;
                System.out.println("Adjusting loop index from " + a);
                a += 3; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + a);
            }
        }
    }
    /**
     * Calculates the sum of squares of the first 10 positive integers.
     *
     * @return The sum of squares.
     */
    public static int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            sum += square;
        }
        return sum;
    }

    /**
     * Prints a right-angled triangle made of asterisks with a height of 5 lines.
     */
    public static void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /**
     * Demonstrates incorrect modification of loop control variable inside a loop.
     */
    public static void modifyIndexIncorrectly() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int a=i;
            System.out.println(numbers[a]);
            // Incorrect modification of loop control variable
            a += 2; // Incrementing by 2 instead of 1
        }
    }
}
