package com.company;

public class Main {

    public static void main(String[] args) {
        
        Car car1 = new Car(1,1,"red",1999, "left", "manuel",2,
                1000, 6.6);

        //checking if the methods are working correctly
        System.out.println(car1.carCharacteristics());

        System.out.println("is the car the same color as the input " + car1.isItTheSameColor("red"));

        System.out.println("is it the same gear as the input " + car1.isTheShiftRight(3));

        car1.increasingCurrentShift();
        System.out.println(car1.getCurrentShift());

        car1.decreasingCurrentShift();
        System.out.println(car1.getCurrentShift());

        System.out.println("is there enough space " + car1.areTheSeatsEnough(2));

        System.out.println("are the passengers and bags too heavy " + car1.arePassengersAndBagsTooHeavy(2, 5));

        System.out.println("you need " + car1.howMuchFuel(300) + " liters to reach your destination");
    }
}
