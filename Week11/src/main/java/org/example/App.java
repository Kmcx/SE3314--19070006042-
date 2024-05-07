package org.example;

/**
 * Hello world!
 *
 */
public final class App

{
    private App() {
    }

    /**
     * The entry point of the application.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        frodo.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        // second parameter added.
        map.navigate("Mordor", false);

        Quest quest = new Quest();
        //second parameter added.
        quest.completeQuest(100,true);
    }
}
