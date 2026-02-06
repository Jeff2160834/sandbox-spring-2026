package org.example.sandbox.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Car car = new Car();
        Truck truck = new Truck();
        System.out.println("Number of vehicles: " + Vehicle.getCounter());

        car.setLoadCapacity(4000);
        truck.setLoadCapacity(8000);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " load capacity: " + vehicle.getLoadCapacity() + " kg");
            vehicle.load();
                vehicle.transport();
                vehicle.move();
                vehicle.stop();
                vehicle.turnLeft();
                vehicle.turnRight();
                vehicle.unload();

        }

    }


}