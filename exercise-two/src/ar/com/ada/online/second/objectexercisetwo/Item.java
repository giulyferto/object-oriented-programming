package ar.com.ada.online.second.objectexercisetwo;

import java.util.Date;

public class Item {
    //Se definen los atributos
    String name;
    Double price;
    Double tax;
    Date expirationDate;

    void calculateTax() {
        tax = price * 0.21;
    }

    Double getTotalToPay() {
        Double result = price + tax;
        return result;
    }

    Boolean canItBeSold() {
        Date today = new Date();
        Boolean canItBeSold = expirationDate.after(today);
        return canItBeSold;
    }
}




