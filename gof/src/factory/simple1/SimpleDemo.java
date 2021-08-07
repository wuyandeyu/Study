package factory.simple1;

public class SimpleDemo {
    public static void main(String[] args) {
        Class animalClass = Animal.class;
        Class personClass = Person.class;
        Animal animal= (Animal) ObjectFactory.getObject(animalClass);
        Person person=(Person) ObjectFactory.getObject(personClass);
        animal.test();
    }
}
