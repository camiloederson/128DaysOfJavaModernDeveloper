package OOP.day26;

public class Dog implements iAnimal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Barking");
    }
}
