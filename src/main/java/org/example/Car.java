package org.example;

public class Car {

    private int numberOfTires;

    private int numberOfDoors;

    private boolean seatBelt;

    private boolean airbag;


    public Car(int numberOfTires, int numberOfDoors, boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numberOfDoors = numberOfDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }

    public Car() {}

    public int getNumberOfTires () {
        return numberOfTires;

    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfDoors () {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean getSeatBelt () {
        return seatBelt;
    }

    public boolean getAirbag () {
        return airbag;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (numberOfTires != car.numberOfTires) return false;
        if (numberOfDoors != car.numberOfDoors) return false;
        if (seatBelt != car.seatBelt) return false;
        return airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        int result = numberOfTires;
        result = 31 * result + numberOfDoors;
        result = 31 * result + (seatBelt ? 1 : 0);
        result = 31 * result + (airbag ? 1 : 0);
        return result;
    }


}
