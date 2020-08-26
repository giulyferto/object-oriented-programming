package ar.com.ada.online.second.objectexercisetwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Se crean los objetos

        Item itemName = new Item();
        Item itemPrice = new Item();
        Item itemTax = new Item();
        Item itemTotalToPay = new Item();
        Item date = new Item();
        Date itemExpirationDate = new Date();
        Date actualDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
        Scanner keyboard = new Scanner(System.in);

        //Se le pide al usuario que ingrese los datos
        try { //Responde a la excepcion de parse
        System.out.print("Ingrese el nombre del producto: ");
        itemName.name = keyboard.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        itemPrice.price = keyboard.nextDouble();

        System.out.print("Ingrese la fecha de vencimiento del producto(dd/MM/yy): ");
        date.expirationDate = keyboard.next();//Se guarda la fecha en una variable de tipo STRING

            itemExpirationDate = dateFormat.parse(date.expirationDate); //Y aca se transforma una variable de un tipo a otro tipo
        }
        catch (ParseException e){//Responde a la excepcion de parse

        }





    }
}
