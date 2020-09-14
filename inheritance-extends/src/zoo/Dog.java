package zoo;

import java.util.Objects;

public class Dog extends Animal {
    private Integer legs;
    private Integer age;

    //Constructores
    public Dog() {
    }

    public Dog(String breed, Integer legs, Integer age) {
        super(breed);
        this.legs = legs;
        this.age = age;
    }

    //getters and setters

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Override
    @Override
    public String toString() {
        return String.format("Dog: {breed = %s, legs = %s, age = %s} ",getBreed(), this.legs, this.age);
    }

    @Override
    public int hashCode() {
        return -23 * Objects.hash(legs, age);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Dog that = (Dog) obj;
        return legs.equals(that.legs) && age.equals(that.age);
    }
}
