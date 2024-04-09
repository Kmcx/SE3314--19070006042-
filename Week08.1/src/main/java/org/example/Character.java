package org.example;

/**
 * A class that represents Character.
 */
public abstract class Character {
  protected String name;
  protected int health;
  protected int attackPower;

  /**
     * Constructs a Character with name,health and attack power.
     *
     * @param name name of the character.
     * @param health health of the character.
     * @param attackPower the attack power of character.
     */
  public Character(String name, int health, int attackPower) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
  }

  /** Gets attack powerof the character.
   *
   *  @return attack power of character.
   */

  public int getAttackPower() {
    return attackPower;
  }

  /**
     * Gets name of the character.
     *
    *  @return the name of the character.
     */
  public String getName() {
    return name != null ? name : "Unknown";
  }

  /**
   * Gets the health of the character.
   *
   *  @return current health of the character.
   *
   */

  public int getHealth() {
    return health;
  }

  /**
     * Method for take damage and reduce charaters health.
     *
     *  @param damage amount of the damage to be taken.
     */
  public void takeDamage(int damage) {
    health -= damage;
  }

  /**

     * Special attack for character for attack on opponent character
     * Each subclass should implement this method to their own special attack logic.
     *
     *  @param opponent the opponent character to attack.
     */

  public abstract void specialAttack(Character opponent);

  /**
     * Method for check if any character defeated.
     *
     *  @return true if character is defeated,false otherwise.
     */
  public boolean isDefeated() {
    return health <= 0;
  }

  /**
   * Defends against incoming damage, reducing it by a certain percentage.
   *
   *  @param defendPercentage The percentage of incoming damage to defend against.
   */
  public void defend(double defendPercentage) {
    int damageToDefend = (int) (health * defendPercentage);

    takeDamage(damageToDefend);

    System.out.println(getName() + " defends against incoming damage, reducing it by "
            + (int) (defendPercentage * 100) + "%.");
  }


}
