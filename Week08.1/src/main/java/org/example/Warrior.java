package org.example;

/**
 * Class represents warrior character.
 */
public class Warrior extends Character {

  public Warrior(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }
  /**
  * Perform special attack for warrior.
  *
  *  @param opponent the opponent character to attack.
  */

  @Override
    public void specialAttack(Character opponent) {
    opponent.takeDamage(attackPower * 2);
  }

  /**
   * Taunts the opponent, drawing their attention.
   */
  public void taunt() {
    System.out.println(name + " Throwing gang signs to opponent.");
  }
}