package OOP.day24;

import javax.xml.namespace.QName;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("I am " + getName() + ". I'm barking");
    }
}
