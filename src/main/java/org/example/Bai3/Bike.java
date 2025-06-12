package org.example.Bai3;

public class Bike implements IVehicle, IBike {
    public void run() {
        System.out.println("Bike is running.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }

    public void accelerate() {
        System.out.println("Bike accelerating.");
    }

    public void startEngine() {
        System.out.println("Bike engine started.");
    }
}