package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private Aquatic[] aquaticAnimals;

    private String name;
    private String city;

    private static final int nbrCages = 25;

    private int animalCount = 0;
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        aquaticAnimals = new Aquatic[10];

        setName(name);
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne doit pas etre vide.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public int getAquaticCount() {
        return aquaticCount;
    }

    public void displayZoo() {
        System.out.println("Nom : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name
                + "', city='" + city
                + "', nbrCages=" + nbrCages + "}";
    }


    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        if (animal == null) {
            return -1;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }

        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull()) {
            return false;
        }

        if (searchAnimal(animal) != -1) {
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;

        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;
        animalCount--;

        return true;
    }

    public boolean isZooFull() {
        return animalCount == nbrCages;
    }

    public Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        }

        return z2;
    }


    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic == null) {
            System.out.println("L'animal aquatique est invalide.");
            return;
        }

        if (aquaticCount >= aquaticAnimals.length) {
            System.out.println("Le tableau des animaux aquatiques est plein.");
            return;
        }

        aquaticAnimals[aquaticCount] = aquatic;
        aquaticCount++;
    }


    public void displayAquaticAnimals() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }


    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];

                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }


    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
}