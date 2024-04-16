package org.example;

/**
 * Constructs a vehicle with the specified brand, model, and license plate.
 */
public abstract class VehicleAbstract {
  private String brand;
  private String model;
  private String licensePlate;

  /**
     * Method for initialize VehicleAbstract.
     *
     *  @param brand brand of Vehicle.
     * @param model model of the Vehicle.
     * @param licensePlate licence plate number of the vehicle.
     */
  public VehicleAbstract(String brand, String model, String licensePlate) {
    this.brand = brand;
    this.model = model;
    this.licensePlate = licensePlate;
  }

  /**
     * Calculates the rental cost of the vehicle for the specified number of rental days.
     *
     * @param rentalDays The number of days the vehicle is rented.
     * @return The total rental cost of the vehicle.
     */
  public abstract double calculateRentalCost(int rentalDays);
}
