package ar.com.ada.online.second.abstractclassexerciseone;

import java.util.Objects;

public class Rectangle extends Figure {
    private Double length;
    private Double width;

    public Rectangle() {
    }

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double area(Double result) {
        result = this.length * this.width;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: {lenght = %f, width = %f} ",
                this.length, this.width);
    }

    @Override
    public int hashCode() {
        return 30 * Objects.hash(length, width);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Rectangle that = (Rectangle) obj;
        return length.equals(that.length) && width.equals(that.width);
    }
}
