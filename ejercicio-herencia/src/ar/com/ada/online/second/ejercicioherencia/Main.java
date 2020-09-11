package ar.com.ada.online.second.ejercicioherencia;

import override.Person;

public class Main {

    public static void main(String[] args) {
        // Se crean instancias
        Person firstPerson = new Person("Peter", "Parker");
        Person secondPerson = new Person("Matt", "Murdock");
        Person thirdPerson = new Person("Tony", "Stark");
        Person fourthPerson = new Person("Jessica", "Jones");

        //Se muestra el metodo toString y hashCode
        System.out.println("toString()= " + firstPerson.toString());

        System.out.println("\nPeter Parker hashCode= " + firstPerson.hashCode());
        System.out.println("Matt Murdock hashCode= " + secondPerson.hashCode());
        System.out.println("Tony Stark hashCode= " + thirdPerson.hashCode());
        System.out.println("Jessica Jones hashCode= " + fourthPerson.hashCode());

        //Se comparan dos objetos
        System.out.println("\n" + firstPerson.equals(thirdPerson));
    }
}
