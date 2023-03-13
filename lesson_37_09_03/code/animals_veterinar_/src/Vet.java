public class Vet {
    String name;

    public void treatAnimal(Animal animal) {
        System.out.println(animal.name); // напечатать name (кто пришел на прием)
        animal.getDescription();// напечатать описание
    }

    public Vet(String name) {
        this.name = name;
    }
}
