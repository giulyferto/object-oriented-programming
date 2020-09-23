package ar.com.ada.online.second.tesacamosunojo;

import java.util.Objects;

public abstract class Product {
    protected Double discount;
    protected Double finalPrice;

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }
    
    public abstract void discountedPrice ();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return discount.equals(that.discount) &&
                finalPrice.equals(that.finalPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount, finalPrice);
    }
}
