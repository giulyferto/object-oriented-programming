package superclass;

import java.util.Objects;

public class Vehicle {
    //atributos
    protected String brand;
    protected String model;
    protected Integer year;

    //Constructores

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    //metodo propio de la clase
    public String technicalSheet() {

        return String.format(
                "\nMarca: %s\n" +
                        "Modelo: %s\n" +
                        "Año: %d\n" +
                        "\nEste vehiculo no tiene categoria asignada.",
                this.brand,
                this.model,
                this.year
                );
    }

    //override
    @Override
    public String toString() {
        return String.format("Vahicle: {brand = %s, model = %s, year = &d} ",
                this.brand, this.model, this.year);
    }

    @Override
    public int hashCode() {
        return -30 * Objects.hash(brand, model, year);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Vehicle that = (Vehicle) obj;
        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year);
    }
}
