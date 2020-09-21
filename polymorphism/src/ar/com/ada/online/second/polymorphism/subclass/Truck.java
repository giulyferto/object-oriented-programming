package ar.com.ada.online.second.polymorphism.subclass;

import ar.com.ada.online.second.polymorphism.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {
    //Atributo
    private Integer maxLoad;
    //Contructores

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(Integer maxLoad, String brand, String model, Integer year) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }
    //getters and setters

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    //metodos de sobreescritura de la superclase
    public String technicalSheet() {
        String message;
        if (maxLoad < 100) {
            message = "Para iniciar un negocio de flete, esta muy bien este auto\n";
        } else {
            message = "Tienes que usar este auto en el campo, es una máquina de trabajo!!\n";
        }
        return String.format("\nMarca: %s\n Modelo: %s\n Año: %d\n %s",
                this.brand,
                this.model,
                this.year,
                message
        );
    }

    //Override
    @Override
    public String toString() {
        return String.format("Truck: {brand = %s, model = %s, year = &d, rpm = %s} ",
                this.brand, this.model, this.year, this.maxLoad);
    }

    @Override
    public int hashCode() {
        return -30 * Objects.hash(brand, model, year, maxLoad);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Truck that = (Truck) obj;
        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year) && maxLoad.equals(that.maxLoad);
    }

}
