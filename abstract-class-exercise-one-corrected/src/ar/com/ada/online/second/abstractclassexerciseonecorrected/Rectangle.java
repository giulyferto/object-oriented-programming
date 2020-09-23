package ar.com.ada.online.second.abstractclassexerciseonecorrected;

import java.util.Objects;

public class Rectangle extends Figure {
    private Double base;
    private Double height;

    public Rectangle() {
    }

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = base * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle that = (Rectangle) obj;
        return super.equals(obj) &&
                base.equals(that.base) &&
                height.equals(that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangle { base = %f, height = %f, area = %f }",
                base,
                height,
                area
        );
    }
}
