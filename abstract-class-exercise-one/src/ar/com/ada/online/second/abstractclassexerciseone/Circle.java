package ar.com.ada.online.second.abstractclassexerciseone;

import java.util.Objects;

public class Circle extends Figure {
    private final Double PI = 3.141592;
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getPI() {
        return PI;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double area(Double result){
        result = PI * Math.pow(radius,2);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Circle: {radius = %f, PI = %f} ",
                this.radius, this.PI);
    }

    @Override
    public int hashCode() {
        return 30 * Objects.hash(radius,PI);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return radius.equals(that.radius) && PI.equals(that.PI);
    }

}
