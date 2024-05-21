/**
 * This package contains classes related
 * to simulating a basic quest in Middle-earth.
 */

package org.example;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public final class App {

    /**
     * The main method to start the application.
     *
     * @param args command line arguments
     * @throws FileNotFoundException if the file is not found
     */
    public static void main(final String[] args) throws FileNotFoundException {
        final int frodoAge = -50;
        final int aragornAge = 87;

        Character frodo = new Character("Frodo Baggins", frodoAge);
        Character aragorn = new Character("Aragorn", aragornAge);
        MiddleEarthMap map = new MiddleEarthMap();
        Quest quest = new Quest("", frodo, map);

        quest.addParticipant(aragorn);
        quest.start();
    }

    // Private constructor to prevent instantiation if this were a utility class
    private App() {
        throw new UnsupportedOperationException("Utility class");
    }
}
