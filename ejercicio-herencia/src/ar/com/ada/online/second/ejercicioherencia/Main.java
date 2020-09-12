package ar.com.ada.online.second.ejercicioherencia;

import override.Person;

public class Main {

    public static void main(String[] args) {
        // Se crean instancias
        Person firstPerson = new Person("Peter", "Parker");
        Person secondPerson = new Person("Matt", "Murdock");
        Person thirdPerson = new Person("Tony", "Stark");
        Person fourthPerson = new Person("Peter", "Parker");

        //Se muestra el metodo toString y hashCode
        System.out.println("toString()= " + firstPerson.toString());
        System.out.println("toString()= " + secondPerson.toString());
        System.out.println("toString()= " + thirdPerson.toString());
        System.out.println("toString()= " + fourthPerson.toString());

        System.out.println("\nPeter Parker hashCode= " + firstPerson.hashCode());
        System.out.println("Matt Murdock hashCode= " + secondPerson.hashCode());
        System.out.println("Tony Stark hashCode= " + thirdPerson.hashCode());
        System.out.println("Peter Parker hashCode= " + fourthPerson.hashCode());

        //Se comparan dos objetos
        System.out.println("\nSe compara si "+ firstPerson.getName() +" " + firstPerson.getLastName() + " es igual a " + thirdPerson.getName() + " " + thirdPerson.getLastName()
                + "\n Result: " + firstPerson.equals(thirdPerson));

        System.out.println("\nSe compara si "+ firstPerson.getName() +" " + firstPerson.getLastName() + " es igual a " + fourthPerson.getName() + " " + fourthPerson.getLastName()
                + "\n Result: " + firstPerson.equals(fourthPerson));
    }
}
