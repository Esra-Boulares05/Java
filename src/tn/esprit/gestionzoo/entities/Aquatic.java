package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
        super("", "", 0, false);
    }

    public Aquatic(String family, String name, int age,
                   boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{family='" + getFamily()
                + "', name='" + getName()
                + "', age=" + getAge()
                + ", isMammal=" + isMammal()
                + ", habitat='" + habitat + "'}";
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic aquatic = (Aquatic) obj;

        return getAge() == aquatic.getAge()
                && Objects.equals(getName(), aquatic.getName())
                && Objects.equals(habitat, aquatic.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }
}