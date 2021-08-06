package eu.deltasource.internship.car.application;

public class Car {

    public static final int AVERAGE_BAG_WEIGHT = 40;
    public static final int AVERAGE_PASSENGER_WEIGHT = 60;
    private static final int MAX_WEIGHT = 3500;
    private int door;
    private int seats;
    private String color;
    private int creationYear;
    private SteeringWheelSide steeringWheel;
    private String gearShift;
    private int currentShift;
    private int weight;
    private double consumptions;

    public Car(int door, int seats, String color, int creationYear, SteeringWheelSide steeringWheel, String gearShift,
               int currentShift, int weight, double consumptions) {
        this.door = door;
        this.seats = seats;
        this.color = color;
        this.creationYear = creationYear;
        this.steeringWheel = steeringWheel;
        this.gearShift = gearShift;
        this.currentShift = currentShift;
        this.weight = weight;
        this.consumptions = consumptions;
    }

    /**
     * Showing the characteristics of the car.
     */

    public String getCarCharacteristics() {
        return "Doors : " + door + "\n" + "Seats : " + seats + "\n" + "Color : " + color + "\n" + "Creation year : "
                + creationYear + "\n" + "Steering Wheel : " + steeringWheel + "\n" + "Gear shift : " + gearShift + "\n"
                + "Current Shift : " + currentShift + "\n" + "Weight : " + weight + "\n" + "Consumptions : "
                + consumptions + "\n";

    }

    public int getCurrentShift() {
        return currentShift;
    }

    /**
     * Comparing the color of the car with the input color.
     *
     * @param color takes the input color
     * @return true if the colors are the same
     */
    public boolean isItTheSameColor(String color) {
        return this.color == color;
    }

    /**
     * Check the current shift of the car is equal to the input shift.
     *
     * @param shift takes the input shift
     * @return true if the shift is right
     */
    public boolean isTheShiftRight(int shift) {
        return currentShift == shift;
    }

    /**
     * increasing current shift by one.
     */
    public void increaseCurrentShift() {
        this.currentShift++;
    }

    /**
     * Decreasing current shift by one.
     */
    public void decreaseCurrentShift() {
        this.currentShift--;
    }

    /**
     * Checking if there are enough seats for the passengers.
     *
     * @param seats takes the number of the available seats.
     * @return if the seats are enough.
     */
    public boolean areTheSeatsEnough(int seats) {
        if (this.seats - seats > 0) {
            return true;
        }
        return false;
    }

    /**
     * Checks if the passengers and bags are heavier than 3500 kg.
     *
     * @param passengers takes how many passengers will be in the car.
     * @param bags       takes how many bags will be in the car.
     * @return true if passengers and bags are lighter than 3500 kg
     */
    public boolean arePassengersAndBagsTooHeavy(int passengers, int bags) {
        if (passengers * AVERAGE_PASSENGER_WEIGHT + bags * AVERAGE_BAG_WEIGHT > MAX_WEIGHT) {
            return true;
        }
        return false;
    }

    /**
     * Its calculate how much fuel you will need to get to the destination.
     *
     * @param destination takes the destination that you wanna get to.
     * @return the fuel that u will need to get to destination.
     */
    public double howMuchFuelDoYouNeed(double destination) {
        return consumptions * destination;
    }
}
