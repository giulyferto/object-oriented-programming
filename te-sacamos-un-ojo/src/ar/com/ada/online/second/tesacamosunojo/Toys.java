package ar.com.ada.online.second.tesacamosunojo;

import java.util.Objects;

public class Toys extends Product {
    private Double productOne;
    private Double productTwo;
    private Double productThree;

    public Toys() {
    }

    public Toys(Double productOne, Double productTwo, Double productThree) {
        this.productOne = productOne;
        this.productTwo = productTwo;
        this.productThree = productThree;
    }

    public Double getProductOne() {
        return productOne;
    }

    public void setProductOne(Double productOne) {
        this.productOne = productOne;
    }

    public Double getProductTwo() {
        return productTwo;
    }

    public void setProductTwo(Double productTwo) {
        this.productTwo = productTwo;
    }

    public Double getProductThree() {
        return productThree;
    }

    public void setProductThree(Double productThree) {
        this.productThree = productThree;
    }

    @Override
    public void discountedPrice() {

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Toys that = (Toys) obj;
        return super.equals(obj) &&
                productOne.equals(that.productOne) &&
                productTwo.equals(that.productTwo) &&
                productThree.equals(that.productThree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), productOne, productTwo, productThree);
    }

    @Override
    public String toString() {
        return String.format("Toys{ productOne = %f, productTwo = %f, productThree = %f, discount = %f, finalPrice = %f }",
                productOne,
                productTwo,
                productThree,
                discount,
                finalPrice
        );

    }
}
