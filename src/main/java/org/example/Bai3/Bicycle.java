package org.example.Bai3;

class Bicycle implements IVehicle, IBicycle {
    public void run() {
        System.out.println("Bicycle is running.");
    }

    public void stop() {
        System.out.println("Bicycle stopped.");
    }

    public void accelerate() {
        System.out.println("Bicycle speeding up.");
    }

    public void cycle() {
        System.out.println("Cycling the bicycle.");
    }
}
