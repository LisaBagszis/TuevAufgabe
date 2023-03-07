package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

@Test
void checkIfCarHasFourTires () {

    //Given
    Car testCar = new Car(4, 3, true, true);
    //When
    boolean actual = CarInspectionService.checkNumberOfTires(testCar);
    //Then
    assertEquals(true, actual);

}

@Test
void checkIfCarHasSeatbelt () {
    // Given
    Car carWithSeatBelt = new Car(4, 3, true, true);


    // When
    boolean actual = CarInspectionService.checkSeatBelt(carWithSeatBelt);


    // Then
    assertEquals(true, actual);

}

    @Test
    void checkIfCarHasAirbag () {
        // Given
        Car carWithAirbag = new Car(4, 3, true, true);


        // When
        boolean actual = CarInspectionService.checkAirBag(carWithAirbag);


        // Then
        assertEquals(true, actual);

    }

    @Test
    void checkIfCarHasThreeOrFiveDoors () {

        //Given
        Car testCar = new Car(4, 3, true, true);


        //When
        boolean actual = CarInspectionService.checkNumberOfDoors(testCar);

        //Then
        assertEquals(true, actual);

    }

    @Test
    void checkIfMethodsAreAllTrue () {
        //Given
        Car testCar = new Car(4, 3, true, true);

        //When
        boolean actual = CarInspectionService.checkIfAllTrue(testCar);

        //Then
        assertEquals(true, actual);

    }
}
