package ar.com.ada.online.second.tesacamosunojo;

import java.util.Objects;

public abstract class Product {
    protected String name;
    protected Double price;
    protected Double discount;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public abstract void calculateDiscount ();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return discount.equals(that.discount) &&
                name.equals(that.name) && price.equals(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount, price, name);
    }
}
