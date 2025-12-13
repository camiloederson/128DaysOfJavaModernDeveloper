package OOP.day24;

public class TestingOOP {
    public static void main(String[] args) {

        Animal cat = new Cat("Chalate");
        Animal dog = new Dog("Rufo");

        System.out.print("🐈 ");
        cat.makeSound();
        System.out.print("🐶 ");
        dog.makeSound();
    }
}
