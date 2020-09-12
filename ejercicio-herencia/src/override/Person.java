package override;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;

    //constructores
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Override

    @Override
    public String toString() {
        return String.format("Person: {name = %s, lastName = %s} ", this.name, this.lastName);
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(name, lastName);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return name.equals(that.name) && lastName.equals(that.lastName);
    }
}
