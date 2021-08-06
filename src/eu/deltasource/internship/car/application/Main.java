package eu.deltasource.internship.car.application;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1, 1, "red", 1999, SteeringWheelSide.LEFT, "manuel", 2,
                1000, 6.6);

        /**
         * Checking if the methods are working correctly
         */
        System.out.println(car1.getCarCharacteristics());
        System.out.println("is the car the same color as the input " + car1.isItTheSameColor("red"));
        System.out.println("is it the same gear as the input " + car1.isTheShiftRight(3));

        car1.increaseCurrentShift();
        System.out.println(car1.getCurrentShift());

        car1.decreaseCurrentShift();
        System.out.println(car1.getCurrentShift());

        System.out.println("is there enough space " + car1.areTheSeatsEnough(2));
        System.out.println("are the passengers and bags too heavy " + car1.arePassengersAndBagsTooHeavy(2, 5));
        System.out.println("you need " + car1.howMuchFuelDoYouNeed(300) + " liters to reach your destination");
    }
}
