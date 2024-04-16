package org.example;


/**
 * Class representing hybrid feature.
 */
public class Hybrid implements AdditionalFeatureAbstract {
  private static final double HYBRID_COST_PER_DAY = 10.0;

  @Override
    public double calculateAdditionalCost(int rentalDays) {
    return rentalDays * HYBRID_COST_PER_DAY;
  }

}
