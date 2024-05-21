package org.example;

import java.util.ArrayList;

/**
 * This class represents a quest in Middle Earth.
 */
public class Quest {
    /**
     * The name of the quest.
     */
    private String questName;

    /**
     * The leader of the quest.
     */
    private Character leader;

    /**
     * The participants of the quest.
     */
    private ArrayList<Character> participants;

    /**
     * The map of Middle Earth for the quest.
     */
    private MiddleEarthMap map;

    /**
     * Constructs a Quest with the specified name, leader, and map.
     *
     * @param questName1 the name of the quest
     * @param leader1 the leader of the quest
     * @param map1 the map of Middle Earth for the quest
     */
    public Quest(final String questName1, final Character leader1,
                 final MiddleEarthMap map1) {
        this.questName = questName1;
        this.leader = leader1;
        this.map = map1;
        this.participants = new ArrayList<>();
    }

    /**
     * Adds a participant to the quest.
     *
     * @param character the character to add as a participant
     */
    public final void addParticipant(final Character character) {
        participants.add(character);
    }

    /**
     * Starts the quest and prints the details.
     */
    public final void start() {
        System.out.println("Starting quest: " + questName);
        System.out.println("Leader: " + leader.getName()
                + ", age: " + leader.getAge());
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant.getName()
                    + ", age: " + participant.getAge());
        }
        System.out.println("Map locations:");
        for (String location : map.getLocations()) {
            System.out.println(location);
        }
    }

    /**
     * Gets the name of the quest.
     *
     * @return the name of the quest
     */
    public String getQuestName() {
        return questName;
    }

    /**
     * Sets the name of the quest.
     *
     * @param questName1 the new name of the quest
     */
    public void setQuestName(final String questName1) {
        this.questName = questName1;
    }

    /**
     * Gets the leader of the quest.
     *
     * @return the leader of the quest
     */
    public Character getLeader() {
        return leader;
    }

    /**
     * Sets the leader of the quest.
     *
     * @param leader1 the new leader of the quest
     */
    public void setLeader(final Character leader1) {
        this.leader = leader1;
    }

    /**
     * Gets the participants of the quest.
     *
     * @return the participants of the quest
     */
    public ArrayList<Character> getParticipants() {
        return participants;
    }

    /**
     * Sets the participants of the quest.
     *
     * @param participants1 the new participants of the quest
     */
    public void setParticipants(final ArrayList<Character> participants1) {
        this.participants = participants1;
    }

    /**
     * Gets the map of Middle Earth for the quest.
     *
     * @return the map of Middle Earth
     */
    public MiddleEarthMap getMap() {
        return map;
    }

    /**
     * Sets the map of Middle Earth for the quest.
     *
     * @param map1 the new map of Middle Earth
     */
    public void setMap(final MiddleEarthMap map1) {
        this.map = map1;
    }
}
