package ar.com.ada.online.second.abstractclassexerciseonecorrected;

import java.util.Objects;

public class Circle extends Figure {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return super.equals(obj) &&
                radius.equals(that.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return String.format(
                "Circle { radius = %f, area = %f }",
                radius,
                area
        );
    }
}
