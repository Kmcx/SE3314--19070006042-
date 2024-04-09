package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the game that characters fight.
 */
public class Game {
  /**
   * ArrayList of characters that fight each other.
   */
  private List<Character> characters = new ArrayList<>();

  /**
   * Adds a new character to List.
   *
   * @param character The character to be added.
   */
  public void addCharacter(Character character) {
    characters.add(character);
  }


  /**
   * A method for initialize the game.
   */
  public void startGame() {
    int turn = 0;

    while (!isGameOver()) {
      Character attacker = characters.get(turn % characters.size());
      Character defender = characters.get((turn + 1) % characters.size());

      attacker.specialAttack(defender);
      System.out.println(attacker.getName() + " attacks " + defender.getName());

      if (defender.isDefeated()) {
        System.out.println(defender.getName() + " is defeated!");
        break;
      }

      turn++;
    }
  }

  /**
   * Method for check if game is over or not.
   *
   * @return True if any character defeated.
   */
  public boolean isGameOver() {
    boolean gameOver = false;
    for (Character character : characters) {
      if (character.isDefeated()) {
        gameOver = true;
        break;
      }
    }
    return gameOver;
  }
}

