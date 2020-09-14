package zoo;

import java.util.Objects;

public class Horse extends Animal {
    private String name;
    private Integer power;

    //Constructores

    public Horse() {
    }
    public Horse (String breed, String name, Integer power) {
        super(breed);
        this.name = name;
        this.power = power;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    //Override
    @Override
    public String toString() {
        return String.format("Horse: {breed = %s, name = %s, power = %s} ", getBreed(), this.name, this.power);
    }

    @Override
    public int hashCode() {
        return -30 * Objects.hash(name, power);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Horse that = (Horse) obj;
        return name.equals(that.name) && power.equals(that.power);
    }
}
