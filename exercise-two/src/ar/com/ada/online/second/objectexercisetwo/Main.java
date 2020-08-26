package ar.com.ada.online.second.objectexercisetwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Se crean los objetos

        Item item = new Item();
        Date itemExpirationDate = new Date();
        Date actualDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Scanner keyboard = new Scanner(System.in);


        //Se le pide al usuario que ingrese los datos
        try { //Responde a la excepcion de parse
            System.out.print("Ingrese el nombre del producto: ");
            item.name = keyboard.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            item.price = keyboard.nextDouble();

            System.out.print("Ingrese la fecha de vencimiento del producto(dd/MM/yy): ");
            item.expirationDate = keyboard.next();//Se guarda la fecha en una variable de tipo STRING

            //Se determina si el producto puede venderse o no

            itemExpirationDate = dateFormat.parse(item.expirationDate); //Y aca se transforma una variable de un tipo a otro tipo
        } catch (ParseException e) {//Responde a la excepcion de parse
        }
        if ((actualDate.before(itemExpirationDate)) || (actualDate.equals(itemExpirationDate))) {
            //Se muestra el nombre del producto
            System.out.println("\nSu producto: " + item.name);
            //Se muestra el precio
            System.out.println("Tiene un costo de: $" + item.price);
            //Se muestra el impuesto del producto ejecutando el metodo
            item.calculateTax();
            //Semuestra el precio final del producto ejecutando el metodo
            System.out.println("El precio final del producto sera de: " + item.getTotalToPay());
        } else if (actualDate.after(itemExpirationDate)) {
            System.out.println("El artículo no puede venderse");
            System.exit(0);

        }
    }
}
