package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1,1,"red",1999, "left", "manuel",2,
                1000, 6.6);

        System.out.println(car1.carCharacteristics());
        System.out.println(car1.isItTheSameColor("red"));
    }
}
