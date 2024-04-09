package org.example;

/**
 * Class represent archer character.
 */
public class Archer extends Character {
  public Archer(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
    public void specialAttack(Character opponent) {
    opponent.takeDamage(attackPower + 20);
  }

  /**
   * Defends against incoming damage, reducing it by 10%.
   *
   *  @param incomingDamage The amount of incoming damage.
   */
  public void defend(int incomingDamage) {
    int reducedDamage = (int) (incomingDamage * 0.9);
    takeDamage(reducedDamage);
    System.out.println(name + " defends against damage. Health reduced by " + reducedDamage);
  }
}