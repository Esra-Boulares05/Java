package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        Animal lion2 = new Animal("Felidae", "Simba", 5, true);
        Animal zebre = new Animal("Equidae", "Marty", 4, true);
        Animal singe = new Animal("Cercopithecidae", "Coco", 3, true);
        Animal ours = new Animal("Ursidae", "Baloo", 6, true);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion2));
        System.out.println(myZoo.addAnimal(zebre));
        System.out.println(myZoo.addAnimal(singe));
        System.out.println(myZoo.addAnimal(ours));
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(zebre));
        System.out.println(myZoo.searchAnimal(ours));
        System.out.println(myZoo.removeAnimal(lion));
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println(myZoo.isZooFull());
        Zoo z2 = new Zoo("Safari", "Hammamet");
        z2.addAnimal(new Animal("Ursidae", "Baloo", 6, true));
        Zoo plusGrand = myZoo.compareZoo(myZoo, z2);
        System.out.println(plusGrand.getName());

        Animal bebe = new Animal("Felidae", "Test", -3, true);
        Zoo vide = new Zoo("", "Tunis");
    }
}