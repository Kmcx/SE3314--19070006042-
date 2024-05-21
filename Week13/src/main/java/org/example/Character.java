package org.example;

/**
 * This class represents a character with a name and age.
 */
public class Character {
    /**
     * The name of the character.
     */
    private String name;

    /**
     * The age of the character.
     */
    private int age;

    /**
     * Constructs a Character with the specified name and age.
     *
     * @param names the name of the character
     * @param ages the age of the character
     */
    public Character(final String names, final int ages) {
        this.name = names;
        this.age = ages;
    }

    /**
     * Gets the name of the character.
     *
     * @return the name of the character
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the character.
     *
     * @param names the new name of the character
     */
    public void setName(final String names) {
        this.name = names;
    }

    /**
     * Gets the age of the character.
     *
     * @return the age of the character
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the character.
     *
     * @param ages the new age of the character
     */
    public void setAge(final int ages) {
        this.age = ages;
    }
}
