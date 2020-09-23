package ar.com.ada.online.second.abstractclassexerciseonecorrected;

import java.util.Objects;

public abstract class Figure {
    protected Double area;

    public Figure() {
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public abstract void calculateArea();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Figure that = (Figure) obj;
        return area.equals(that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }
}
