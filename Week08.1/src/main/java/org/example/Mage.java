package org.example;

/**
 * Class represents a mage character.
 */
public class Mage extends Character {

  /**
     * Constructs a nwe mage character with name,health and attack power.
     *
     *  @param name the name of the mage character
     * @param health the health of the mage character
     * @param attackPower the attack power of the mage character
     */
  public Mage(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  /**
     * Perform specials attack for mage character.
     *
     *  @param opponent the opponent character to attack.
     */
  @Override
    public void specialAttack(Character opponent) {
    opponent.takeDamage(attackPower + 50);
  }

  /**
   * Temporarily boosts the mage's attack power.
   *
   *  @param duration The duration of the boost in turns.
   */
  public void boost(int duration) {
    attackPower += 20;
    System.out.println(name + " boosts attack power by 20 for " + duration + " turns.");
  }
}
