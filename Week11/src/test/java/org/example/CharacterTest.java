package org.example;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Character class.
 */
public class CharacterTest {

    /**
     * Constructs a new CharacterTest.
     */
    public CharacterTest() {
    }

    /**
     * Test the printDetails method of the Character class.
     */
    @Test
    public void testPrintDetails() {
        // Create a character
        Character character = new Character("Frodo", "Hobbit", 50);

        // Test printDetails method
        assertEquals("Character is a Hobbit", getPrintedDetails(character));

        // Update character details
        character = new Character("Aragorn", "Human", 88);

        // Test printDetails method again
        assertEquals("Character is 50 or older", getPrintedDetails(character));
    }

    /**
     * Helper method to capture printed details.
     *
     * @param character The character whose details will be printed.
     * @return The printed details as a string.
     */
    private String getPrintedDetails(final Character character) {
        // Capture printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        // Call the method to print details
        character.printDetails();

        // Reset System.out
        System.out.flush();
        System.setOut(originalOut);

        // Return captured output
        return outputStream.toString().trim();
    }
}
