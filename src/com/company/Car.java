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

    public String carCharacteristics(){
        return "Doors : " + door + "\n" + "Seats : " + seats + "\n" + "Color : " + color + "\n" + "Creation year : "
                + creationYear + "\n" + "Steering Wheel : " + steeringWheel + "\n" + "Gear shift : " + gearShift + "\n"
                + "Current Shift : " + currentShift + "\n" + "Weight : " + weight + "\n" + "Consumptions : "
                + consumptions + "\n";

    }

    public boolean isItTheSameColor(String color){
        return this.color == color;
    }

    public boolean isTheShiftRight(int shift){
        return currentShift == shift;
    }
}
