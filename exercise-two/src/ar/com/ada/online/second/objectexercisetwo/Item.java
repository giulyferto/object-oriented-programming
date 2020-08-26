package ar.com.ada.online.second.objectexercisetwo;


public class Item {
    //Se definen los atributos
    String name;
    Double price;
    Double tax;
    String expirationDate;

    void calculateTax() {

        tax = price * 0.21;
    }

    Double getTotalToPay() {
        Double result = price + tax;
        return result;
    }

    Boolean canItBeSold() {
        //Se comparan las dos fechas
        if (expirationDate.after(//fecha actual){
            Boolean expired = true;
        }

        return null;
    }
}
