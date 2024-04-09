package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A smoke test class to verify the basic functionality of the game.
 * This test class checks if the game starts properly and ends when expected.
 */
public class SmokeTest {

  /**
     * Tests the start of the game by adding characters and starting the game.
     * The test verifies that the game ends when expected.
     */
  @Test
    public void testGameStart() {
    Game game = new Game();

    game.addCharacter(new Warrior("Conan", 100, 15));
    game.addCharacter(new Mage("Merlin", 80, 20));
    game.addCharacter(new Archer("Legolas", 90, 18));

    game.startGame();

    assertTrue(game.isGameOver());
  }

  /**
    * Tests the defend() method of the Character class.
    * Verifies that the character's health is reduced after defending against incoming damage.
    */
  @Test
    public void testDefend() {

    Character character = new Warrior("Conan", 100, 15);

    int initialHealth = character.getHealth();
    int incomingDamage = 20;
    character.defend(incomingDamage);


    assertTrue(character.getHealth() < initialHealth);
  }
  /**
     * Tests the taunt() method of the Warrior class.
     * Verifies that the character performs a taunt action.
     */

  @Test
   public void testTaunt() {

    Warrior warrior = new Warrior("Conan", 100, 15);

    warrior.taunt();

  }

  /**
         * Tests the boost() method of the Mage class.
         * Verifies that the mage's attack power is increased after boosting.
         */
  @Test
  public void testBoost() {
    Mage mage = new Mage("Merlin", 80, 20);
    int initialAttackPower = mage.getAttackPower();
    mage.boost(3); // Assuming boosting for 3 turns

    assertTrue(mage.getAttackPower() > initialAttackPower);
  }
}


