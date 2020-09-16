package subclass;

import superclass.Vehicle;

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
        if (rpm > 0 && rpm <= 50) {
            return String.format(
                    "\nMarca: %s\n" +
                            "Modelo: %s\n" +
                            "Año: %d\n" +
                            "\nEl auto es muy bonito pero solo sirve para salir a pasear\n",
                    this.brand,
                    this.model,
                    this.year
            );
        } else if (rpm <= 300) {
            return String.format(
                    "\nMarca: %s\n" +
                            "Modelo: %s\n" +
                            "Año: %d\n" +
                            "\nCon este auto puedes desafiar a cualquiera en la pista\n",
                    this.brand,
                    this.model,
                    this.year
            );
        } else if (rpm <= 600) {
            return String.format(
                    "\nMarca: %s\n" +
                            "Modelo: %s\n" +
                            "Año: %d\n" +
                            "\nSi tienes este auto, debes considerar participar en NASCAR\n",
                    this.brand,
                    this.model,
                    this.year
            );
        } else {
            return String.format(
                    "\nMarca: %s\n" +
                            "Modelo: %s\n" +
                            "Año: %d\n" +
                            "\n¿Eres parte del elenco de rápidos y furiosos?\n",
                    this.brand,
                    this.model,
                    this.year
            );
        }
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
