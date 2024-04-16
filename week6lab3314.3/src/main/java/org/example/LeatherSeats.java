package org.example;


/**
 * Class representing leather seats feature.
 */

public class LeatherSeats implements AdditionalFeatureAbstract {
  private static final double LEATHER_SEATS_COST_PER_DAY = 30.0;

  @Override
    public double calculateAdditionalCost(int rentalDays) {
    return rentalDays * LEATHER_SEATS_COST_PER_DAY;
  }
}
