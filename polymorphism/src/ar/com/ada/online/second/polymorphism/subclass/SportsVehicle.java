package ar.com.ada.online.second.polymorphism.subclass;

import ar.com.ada.online.second.polymorphism.superclass.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    //Atributos
    private Integer rpm;

    //Constructores

    public SportsVehicle() {
    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(Integer rpm, String brand, String model, Integer year) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    //getters and setters

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    //metodos de sobreescritura de la superclase
    public String technicalSheet() {
        String message;
        if (rpm > 0 && rpm <= 50) {
            message = "El auto es muy bonito pero solo sirve para salir a pasear\n";
        } else if (rpm <= 300) {
            message = "Con este auto puedes desafiar a cualquiera en la pista\n";
        } else if (rpm <= 600) {
            message = "Si tienes este auto, debes considerar participar en NASCAR\n";
        } else {
            message = "¿Eres parte del elenco de rápidos y furiosos?\n";
        }
        return String.format(
                "\nMarca: %s\n Modelo: %s\n Año: %d\n %s",
                this.brand,
                this.model,
                this.year,
                message
        );
    }

    //Override
    @Override
    public String toString() {
        return String.format("SportsVehicle: {brand = %s, model = %s, year = &d, rpm = %s} ",
                this.brand, this.model, this.year, this.rpm);
    }

    @Override
    public int hashCode() {
        return -30 * Objects.hash(brand, model, year, rpm);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SportsVehicle that = (SportsVehicle) obj;
        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year) && rpm.equals(that.rpm);
    }
}
