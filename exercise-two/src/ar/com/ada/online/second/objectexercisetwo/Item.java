package ar.com.ada.online.second.objectexercisetwo;

import java.util.Date;

public class Item {
    //Se definen los atributos
    String name;
    Double price;
    Double tax;
    String expirationDate;

    void calculateTax() {
        tax = price * 0.21;
        System.out.println("El impuesto del producto es de: $" + tax);
    }

    Double getTotalToPay() {
        Double result = price + tax;
        return result;
    }

//    Boolean canItBeSold(expirationDate) {
//        return true;
//    }
}




