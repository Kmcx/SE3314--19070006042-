package org.example;

/**
 * Represents a new quest in the fictional world.
 */
public class NewQuest extends Quest {
    /**
     * Check for Palatnir Retrieved or not.
     */
    private boolean isPalantirRetrieved;

    /**
     * Constructs a new quest to retrieve the Palantir.
     */
    public NewQuest() {
        super("Retrieve the Palantir", "Characters must journey to Isengard to retrieve the Palantir from Saruman's tower");
        this.isPalantirRetrieved = false;
    }

    /**
     * Checks if the Palantir has been retrieved.
     *
     * @return True if the Palantir has been retrieved, otherwise false.
     */
    public boolean isPalantirRetrieved() {
        return isPalantirRetrieved;
    }

    /**
     * Simulates completing the quest and retrieving the Palantir.
     */
    public void completeQuest() {
        // Simulate completing the quest
        isPalantirRetrieved = true;
        System.out.println("The Palantir has been retrieved from Isengard!");
    }
}
