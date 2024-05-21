package org.example;

import java.io.FileNotFoundException;

public class QuestTest {

    public static void main(String[] args) {
        try {
            // Create some characters
            Character frodo = new Character("Frodo Baggins", 50);
            Character aragorn = new Character("Aragorn", 87);

            // Create a MiddleEarthMap instance (assuming the map.txt exists and is properly formatted)
            MiddleEarthMap map = new MiddleEarthMap();

            // Create a quest
            Quest quest = new Quest("Destroy the One Ring", frodo, map);

            // Add participants to the quest
            quest.addParticipant(aragorn);

            // Start the quest
            quest.start();
        } catch (FileNotFoundException e) {
            System.out.println("Map file not found: " + e.getMessage());
        }
    }
}
