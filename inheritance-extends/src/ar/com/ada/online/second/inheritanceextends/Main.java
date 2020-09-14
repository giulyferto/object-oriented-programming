package ar.com.ada.online.second.inheritanceextends;

import zoo.Dog;
import zoo.Horse;

public class Main {

    public static void main(String[] args) {
        // Se crean dos instancias de cada subclase
        Dog firstDog = new Dog("Golden", 4, 5);
        Dog secondDog = new Dog("Poodle", 4, 8);

        Horse firstHorse = new Horse("Gypsy horse", "Alex", 10);
        Horse secondHorse = new Horse("Gypsy horse", "Alex", 10);

        //toString, hashCode, equals

        System.out.println("toString: " + firstDog);
        System.out.println("toString: " + secondDog);

        System.out.println("toString: " + firstHorse);
        System.out.println("toString: " + secondHorse + "\n");

        System.out.println("First dog hashCode: " + firstDog.hashCode());
        System.out.println("Second dog hashCode: " + secondDog.hashCode());

        System.out.println("First horse hashCode: " + firstHorse.hashCode());
        System.out.println("Second horse hashCode: " + secondHorse.hashCode());

        System.out.printf("\nSe comprara si %s es igual a %s " +
                "\n Result =  %s\n", firstDog, secondDog, firstDog.equals(secondDog));

        System.out.printf("\nSe comprara si %s es igual a %s " +
                "\n Result =  %s\n", firstDog, firstHorse, firstDog.equals(firstHorse));

        System.out.printf("\nSe comprara si %s es igual a %s " +
                "\n Result =  %s\n", firstHorse, secondHorse, firstHorse.equals(secondHorse));


    }
}
