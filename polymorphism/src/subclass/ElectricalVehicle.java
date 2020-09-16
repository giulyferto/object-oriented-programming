package subclass;

import superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    //Atributos
    private Integer potency;

    //constructores
    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(Integer potency, String brand, String model, Integer year) {
        super(brand, model, year);
        this.potency = potency;
    }
    //getters and setters

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }
    //metodos de sobreescritura de la superclase

    public String technicalSheet() {
        if (this.year < 2007) {
            return "\nNo existe modelo para este año";

        } else return String.format(
                "\nMarca: %s\n" +
                        "Modelo: %s\n" +
                        "Año: %d\n" +
                        "Es un auto de última tecnología!",
                this.brand,
                this.model,
                this.year
        );
    }

    //Override
    @Override
    public String toString() {
        return String.format("ElectricalVehicle: {brand = %s, model = %s, year = &d, potency = %s} ",
                this.brand, this.model, this.year, this.potency);
    }

    @Override
    public int hashCode() {
        return -30 * Objects.hash(brand, model, year, potency);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) obj;
        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year) && potency.equals(that.potency);
    }
}
