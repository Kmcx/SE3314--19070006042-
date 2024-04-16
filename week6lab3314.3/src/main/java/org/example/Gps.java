package org.example;

/**
 * Class representing GPS feature.
 */
public class Gps implements AdditionalFeatureAbstract {
  private static final double GPS_COST_PER_DAY = 20.0;

  @Override
    public double calculateAdditionalCost(int rentalDays) {
    return rentalDays * GPS_COST_PER_DAY;
  }
}
