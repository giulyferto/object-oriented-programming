package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
//En el metodo main de la clase Main, crear un objeto de cada clase, asignar valores a los atributos y mostrarlos por pantalla.
//Tambien en se debe ejecutar al menos un metodo de cada instancia.

        //Se crean los objetos
        Animal raccoon = new Animal();
        Vehicle car = new Vehicle();
        Person obama = new Person();

        //Se le asignan valores a los objetos
        raccoon.breed = "Procyon lotor lotor";
        raccoon.color = "Gray & Black";
        raccoon.name = "Junior";

        car.brand = "Mazda";
        car.maxSpeed = "150 km/h";
        car.color = "White";


        System.out.println(obama.name = "Barack");


        //Se ejecuta un metodo de cada clase
        raccoon.sleep();
        car.moveOn();
        obama.talk();

    }
}
