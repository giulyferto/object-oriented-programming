package ar.com.ada.online.second.abstractclassexerciseone;

import java.util.Objects;

public class Triangle extends Figure {
    private Double base;
    private Double height;

    public Triangle() {
    }

    public Triangle(Double base, Double height) {
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

    public Double area(Double result){
        result = (this.base * this.height) / 2;
        return result;
    }
    @Override
    public String toString() {
        return String.format("Triangle: {base = %f, height = %f} ",
                this.base, this.height);
    }

    @Override
    public int hashCode() {
        return 30 * Objects.hash(base, height);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
       Triangle that = (Triangle) obj;
        return base.equals(that.base) && height.equals(that.height);
    }
}
