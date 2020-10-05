package ar.com.ada.online.second.tesacamosunojo;

public class Tools extends  Product {
    @Override
    public void calculateDiscount() {
        if (Cart.paymentMethod.equals("tdc"))
            discount = price * 0.05;
        else
            discount = 0d;
    }
}
