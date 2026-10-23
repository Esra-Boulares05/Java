package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {


        Zoo myZoo = new Zoo("Belvedere", "Tunis");

        myZoo.displayZoo();


        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();


        Aquatic dolphin1 = new Dolphin(
                "Delphinidae", "Flipper", 5,
                true, "Ocean", 30.5f
        );

        Aquatic dolphin2 = new Dolphin(
                "Delphinidae", "Dolly", 7,
                true, "Ocean", 25.0f
        );

        Aquatic penguin1 = new Penguin(
                "Spheniscidae", "Pingu", 4,
                false, "Antarctica", 200.0f
        );

        Aquatic penguin2 = new Penguin(
                "Spheniscidae", "Pingu2", 3,
                false, "Antarctica", 150.0f
        );


        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        System.out.println(dolphin1);
        System.out.println(dolphin2);
        System.out.println(penguin1);
        System.out.println(penguin2);


        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);


        System.out.println("\n--- Nage des animaux aquatiques ---");
        myZoo.displayAquaticAnimals();


        System.out.println("\n--- Profondeur maximale ---");
        System.out.println(
                "Profondeur maximale des pingouins : "
                        + myZoo.maxPenguinSwimmingDepth()
        );


        System.out.println("\n--- Nombre d'animaux aquatiques ---");
        myZoo.displayNumberOfAquaticsByType();


        System.out.println("\n--- Test de equals() ---");

        Dolphin dolphinA = new Dolphin(
                "Delphinidae", "Flipper", 5,
                true, "Ocean", 30.5f
        );

        Dolphin dolphinB = new Dolphin(
                "Delphinidae", "Flipper", 5,
                true, "Ocean", 25.0f
        );

        Dolphin dolphinC = new Dolphin(
                "Delphinidae", "Flipper", 6,
                true, "Ocean", 30.5f
        );

        System.out.println("dolphinA equals dolphinB : "
                + dolphinA.equals(dolphinB));

        System.out.println("dolphinA equals dolphinC : "
                + dolphinA.equals(dolphinC));
    }
}