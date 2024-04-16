package org.example;

/**
 * Class representing a luxury vehicle.
 */
public class LuxuryVehicle extends  VehicleAbstract {

  private static final double BASE_PRICE_PER_DAY = 100.0;
  private final AdditionalFeatureAbstract[] additionalFeatures;

  /**
     * Constructs a luxury vehicle with the specified brand, model, license plate,
     * and additional features.
     *
     *  @param brand             The brand of the luxury vehicle.
     * @param model             The model of the luxury vehicle.
     * @param licensePlate      The license plate of the luxury vehicle.
     */

  public LuxuryVehicle(String brand, String model, String licensePlate,
                       AdditionalFeatureAbstract... additionalFeatureAbstracts) {
    super(brand, model, licensePlate);
    this.additionalFeatures = additionalFeatureAbstracts;
  }

  @Override
    public double calculateRentalCost(int rentalDays) {
    double totalCost = BASE_PRICE_PER_DAY * rentalDays;
    for (AdditionalFeatureAbstract feature : additionalFeatures) {
      totalCost += feature.calculateAdditionalCost(rentalDays);
    }
    return totalCost;
  }
}
