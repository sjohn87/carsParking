package org.parking;

/**
 * realizing emulation of app for cars parking system, where
 * cars arrive, depart, and system can calculate the final payment
 * and check current cars on the parking
 */
public class ParkingApplication {
    public static void main(String[] args) {
        Parking parking = new Parking(5, 1);
        ControlSystem controlSystem = new ControlSystem(parking);
        controlSystem.manageApp();
    }
}





