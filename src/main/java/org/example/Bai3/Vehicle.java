package org.example.Bai3;

interface IVehicle {
    void run();
    void stop();
    void accelerate();
}

interface IBike {
    void startEngine();
}

interface IBicycle {
    void cycle();
}

class Bike implements IVehicle, IBike {
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
