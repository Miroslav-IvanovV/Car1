package com.company;

public class Car {

    private int door;
    private int seats;
    private String color;
    private int creationYear;
    private String steeringWheel;
    private String gearShift;
    private int currentShift;
    private int weight;
    private double consumptions;

    public Car(int door, int seats, String color, int creationYear, String steeringWheel, String gearShift,
               int currentShift, int weight, double consumptions){
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

    //showing the characteristics of the car
    public String carCharacteristics(){
        return "Doors : " + door + "\n" + "Seats : " + seats + "\n" + "Color : " + color + "\n" + "Creation year : "
                + creationYear + "\n" + "Steering Wheel : " + steeringWheel + "\n" + "Gear shift : " + gearShift + "\n"
                + "Current Shift : " + currentShift + "\n" + "Weight : " + weight + "\n" + "Consumptions : "
                + consumptions + "\n";

    }

    //Getter
    public int getCurrentShift() {
        return currentShift;
    }

    //comparing the color of hte car with the input color
    public boolean isItTheSameColor(String color){
        return this.color == color;
    }

    // checking if the shift is right
    public boolean isTheShiftRight(int shift){
        return currentShift == shift;
    }

    // increasing current shift by one
    public void increasingCurrentShift(){
        this.currentShift++;
    }

    // decreasing current shift by one
    public void decreasingCurrentShift(){
        this.currentShift--;
    }

    //checking if there is enough space for the passengers
    public boolean areTheSeatsEnough(int seats){
        if(this.seats - seats > 0) return true;
        else return false;
    }

    // checking if the passengers are too heavy
    public boolean arePassengersAndBagsTooHeavy(int passengers, int bags){
        if(passengers * 60 + bags * 40 > 3500) return true;
        else return false;
    }

    //how much fuel do we need to get to the destination
    public double howMuchFuel(int destination){
        return consumptions * destination;
    }
}
