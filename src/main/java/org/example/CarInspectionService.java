package org.example;



public class CarInspectionService {


    public static boolean checkNumberOfTires(Car carToCheck) {
        return (carToCheck.getNumberOfTires() == 4);
    }


    public static boolean checkSeatBelt(Car carWithSeatBelt) {
        return carWithSeatBelt.getSeatBelt();
    }

    public static boolean checkAirBag(Car carWithAirbag) {
        return carWithAirbag.getAirbag();
    }


    public static boolean checkNumberOfDoors(Car carToCheck) {
        return ((carToCheck.getNumberOfDoors() == 3) || (carToCheck.getNumberOfDoors() == 5));
    }

    public static boolean checkIfAllTrue(Car withManyMethods) {
        return (checkNumberOfTires(withManyMethods) && checkSeatBelt(withManyMethods) && checkAirBag(withManyMethods) && checkNumberOfDoors(withManyMethods));
    }
}

