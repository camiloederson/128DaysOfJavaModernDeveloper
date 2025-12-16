package OOP.day26;

public class AnimalSoundService {

    public static void main(String[] args) {
        iAnimal dog = new Dog("Rufo");
        makeSound(dog);
    }

    public static void makeSound(iAnimal animal){
        animal.makeSound();
    }
}
