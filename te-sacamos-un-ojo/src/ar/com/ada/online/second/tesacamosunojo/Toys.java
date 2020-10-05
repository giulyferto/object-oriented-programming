package ar.com.ada.online.second.tesacamosunojo;

public class Toys extends Product {
    @Override
    public void calculateDiscount() {
        if (Cart.amountOfToys > 3 || Cart.partialPriceToys >= 3000)
            discount = price * 0.25;
        else
            discount = 0d;
    }
}
