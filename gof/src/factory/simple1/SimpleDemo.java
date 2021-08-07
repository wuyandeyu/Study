package factory.simple1;

public class SimpleDemo {
    public static void main(String[] args) {
        Class animalClass = Animal.class;
        Animal animal= (Animal) ObjectFactory.getObject(animalClass);
    }
}
