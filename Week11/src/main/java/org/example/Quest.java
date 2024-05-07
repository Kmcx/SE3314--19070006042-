package org.example;

/**
 * Represents a quest in a fictional world.
 */
public class Quest {
    /**
     * The name of the quest.
     */
    private String quest1;

    /**
     * The description of the quest.
     */
    private String quest2;

    public Quest(final String quest1, final String quest2) {
        this.quest1 = quest1;
        this.quest2 = quest2;
    }

    /**
     * Completes the quest based on the provided points and if the character is a ring bearer.
     *
     * @param points        The points earned during the quest.
     * @param isRingBearer  Indicates if the character is a ring bearer.
     * @return              True if the quest is successfully completed, false otherwise.
     */
    public boolean completeQuest(final int points, final boolean isRingBearer) {
        boolean isQualified = points > 0 && isRingBearer || points < -100 || points == 42;

        if (points > 50) {
            if (points < 100) {
                if (points % 2 == 0) {
                    if (isQualified) {
                        System.out.println("Qualified");
                    }
                }
            }
        }

        return points >= 100;
    }

    /**
     * Gets the name of the quest.
     *
     * @return The name of the quest.
     */
    public String getQuest1() {
        return quest1;
    }

    /**
     * Sets the name of the quest.
     *
     * @param quest1 The name of the quest.
     */
    public void setQuest1(final String quest1) {
        this.quest1 = quest1;
    }

    /**
     * Gets the description of the quest.
     *
     * @return The description of the quest.
     */
    public String getQuest2() {
        return quest2;
    }

    /**
     * Sets the description of the quest.
     *
     * @param quest2 The description of the quest.
     */
    public void setQuest2(final String quest2) {
        this.quest2 = quest2;
    }
}
