package ar.com.ada.online.second.polymorphism;

import ar.com.ada.online.second.polymorphism.subclass.ElectricalVehicle;
import ar.com.ada.online.second.polymorphism.subclass.SportsVehicle;
import ar.com.ada.online.second.polymorphism.subclass.Truck;
import ar.com.ada.online.second.polymorphism.superclass.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicle = {
                new Vehicle("Ford", "fiesta", 2013),
                new Vehicle("Renault", "sandero", 2012),
                new Vehicle("Renault", "Clio", 2014),
                new ElectricalVehicle(300, "Audi", "E-Tron", 2018),
                new ElectricalVehicle(125, "BMW", "I3", 2019),
                new ElectricalVehicle(44, "Renault", "Kangoo ZE VAN", 2005),
                new SportsVehicle(45, "Mazda", "Miata", 1996),
                new SportsVehicle(700, "Chevrolet", "Camaro", 2016),
                new SportsVehicle(200, "Porsche", "911 Turbo S", 2017),
                new Truck(50, "Mazda", "B2300 SE", 1995),
                new Truck(150, "Toyota", "Hilux", 2020),
                new Truck(60, "Ford", "F-150", 2007)
        };

        /*for (int i = 0; i < vehicle.length; i++) {
            System.out.println(vehicle[i].technicalSheet());
        }*/
        for (Vehicle vehicles : vehicle) {
            System.out.println(vehicles.technicalSheet());
        }
    }
}
