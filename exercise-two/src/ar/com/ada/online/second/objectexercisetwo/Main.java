package ar.com.ada.online.second.objectexercisetwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        //Se crean los objetos

        Item item = new Item();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Scanner keyboard = new Scanner(System.in);


        //Se le pide al usuario que ingrese los datos
        System.out.print("Ingrese el nombre del producto: ");
        item.name = keyboard.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        item.price = keyboard.nextDouble();
        // item.price = Double.valueOf(keyboard.next());

        System.out.print("Ingrese la fecha de vencimiento del producto(dd/MM/yy): ");
        String date = keyboard.next();//Se guarda la fecha en una variable de tipo STRING
        item.expirationDate = dateFormat.parse(date);
        //item.expirationDate = dateFormat.parse(keyboard.next());

        if (item.canItBeSold()) {
            //Se muestra el nombre del producto
            System.out.println("\nSu producto: " + item.name);

            //Se muestra el precio
            System.out.println("Tiene un costo de: $" + item.price);

            //Se muestra el impuesto del producto ejecutando el metodo
            item.calculateTax();
            System.out.println("El impuesto del producto es de: $" + item.tax);

            //Semuestra el precio final del producto ejecutando el metodo
            System.out.println("El precio final del producto sera de: " + item.getTotalToPay());

        } else {
            System.out.println("El artículo no puede venderse");
        }


    }
}
