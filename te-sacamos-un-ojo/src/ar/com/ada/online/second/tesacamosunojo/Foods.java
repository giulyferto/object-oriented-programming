package ar.com.ada.online.second.tesacamosunojo;

public class Foods extends  Product{
    @Override
    public void calculateDiscount() {
        if (Cart.dayOfWeek.equals("Tuesday") || Cart.dayOfWeek.equals("Thursday"))
            discount = price * 0.10;
        else
            discount = 0d;
    }
}
