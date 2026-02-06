package org.example.sandbox.Inheritance;

public class Truck extends Vehicle {

        public Truck() {
            counter++;
        }

    @Override
    public void load() {
        System.out.println("Loading truck with capacity: " + loadCapacity + " kg");

    }

    @Override
    public void transport() {
        System.out.println("Transporting truck stuff");

    }

    @Override
    public void move() {
        System.out.println("Moving Truck stuff");

    }

    @Override
    public void stop() {
        System.out.println("Stopping truck");

    }

    @Override
    public void turnLeft() {
        System.out.println("Truck turning left");

    }

    @Override
    public void turnRight() {
        System.out.println("Truck turning right");

    }

    @Override
    public void unload() {
        System.out.println("Unloading truck with capacity: " + loadCapacity + " kg");
    }
}
