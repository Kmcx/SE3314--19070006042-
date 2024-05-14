package org.example;

/**
 * The main class of the application.
 */
public class App {
    /**
     * The main method of the application.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();




        // Displaying the correct and incorrect variable usage
        System.out.println("Demonstrating correct variable usage:");
        loopControl.sumOfSquares();
        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage();

        // Demonstrating empty block usage
        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.avoidEmptyBlock();

        // Demonstrating modified control variable
        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.modifiedControlVariable();
        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifyIndexIncorrectly();

        ExampleUsage exampleUsage = new ExampleUsage();
        System.out.println("\n Demonstrating matrix diagonal summary");
        exampleUsage.matrixDiagonalSum();

        //Demonstrating
        System.out.println("\nDemonstrating print triangle:");
        loopControl.printTriangle();

        exampleUsage.filterAndCountEvenNumbers();
        // Using ExampleUsage class to show practical uses of loops
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        // Summing an array
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
