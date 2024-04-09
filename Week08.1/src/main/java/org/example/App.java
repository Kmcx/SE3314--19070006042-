package org.example;

/**
 * The main class that initializes the game.
 */
public class App {
  /**
     *The main method of the game.
     * Inıtıalizes and starts the game.
     *
     *  @param args The command-line arguments.
     */
  public static void main(String[] args) {
    Game game = new Game();
    game.addCharacter(new Warrior("Conan", 100, 15));
    game.addCharacter(new Mage("Merlin", 80, 20));
    game.addCharacter(new Archer("Legolas", 90, 18));

    game.startGame();
  }
}
