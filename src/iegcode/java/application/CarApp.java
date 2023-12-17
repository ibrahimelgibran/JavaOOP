package iegcode.java.application;


import iegcode.java.data.Avanza;
import iegcode.java.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
