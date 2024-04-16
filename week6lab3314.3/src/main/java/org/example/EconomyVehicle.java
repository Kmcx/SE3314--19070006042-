package org.example;

/**
 * Class representing an economy vehicle.
 */
public class EconomyVehicle extends VehicleAbstract {
  private static final double BASE_PRICE_PER_DAY = 50.0;
  private final AdditionalFeatureAbstract[] additionalFeatureAbstracts;


  /**
     * Constructs an economy vehicle with the specified brand, model,
     * license plate, and additional features.
     *
     * @param brand             The brand of the economy vehicle.
     * @param model             The model of the economy vehicle.
     * @param licensePlate      The license plate of the economy vehicle.
          */
  public EconomyVehicle(String brand, String model, String licensePlate,
                        AdditionalFeatureAbstract... additionalFeatureAbstracts) {
    super(brand, model, licensePlate);
    this.additionalFeatureAbstracts = additionalFeatureAbstracts;
  }

  @Override
    public double calculateRentalCost(int rentalDays) {
    double totalCost = BASE_PRICE_PER_DAY * rentalDays;
    for (AdditionalFeatureAbstract feature : additionalFeatureAbstracts) {
      totalCost += feature.calculateAdditionalCost(rentalDays);
    }
    return totalCost;
  }
}
