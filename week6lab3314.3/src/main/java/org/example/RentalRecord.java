package org.example;

/**
 * Class representing a rental record.
 */
public class RentalRecord {
  private final VehicleAbstract vehicle;
  private final int rentalDays;
  private String lessorIdentity;

  /**
     * Constructs a rental record for the specified vehicle, rental days, and lessor identity.
     *
     * @param vehicle        The vehicle being rented.
     * @param rentalDays     The number of days the vehicle is rented for.
     * @param lessorIdentity The identity of the lessor.
     */

  public RentalRecord(VehicleAbstract vehicle, int rentalDays, String lessorIdentity) {
    this.vehicle = vehicle;
    this.rentalDays = rentalDays;
    this.lessorIdentity = lessorIdentity;
  }

  /**
     * Gets the total rental cost of the vehicle for the rental period.
     *
     * @return The total rental cost.
     */
  public double getTotalRentalCost() {
    return vehicle.calculateRentalCost(rentalDays);
  }
}
