package org.example;

import junit.framework.TestCase;

/**
    * Smoke Test Class for Rental Records.
    */
public class RentalRecordTest extends TestCase {
  /**
     * Smoke test for the car rental system.
     */
  public void testCarRentalSystem() {

    LuxuryVehicle luxuryCar = new LuxuryVehicle("BMW", "X5", "ABC123",
                new Gps(), new LeatherSeats());


    EconomyVehicle economyCar = new EconomyVehicle("Toyota", "Prius", "XYZ789",
                new Hybrid());


    RentalRecord rentalRecordLuxury = new RentalRecord(luxuryCar, 5, "John Doe");
    RentalRecord rentalRecordEconomy = new RentalRecord(economyCar, 3, "Jane Smith");


    double totalCostLuxury = rentalRecordLuxury.getTotalRentalCost();
    double totalCostEconomy = rentalRecordEconomy.getTotalRentalCost();


    System.out.println("Total rental cost for luxury car: $" + totalCostLuxury);
    System.out.println("Total rental cost for economy car: $" + totalCostEconomy);
  }


}