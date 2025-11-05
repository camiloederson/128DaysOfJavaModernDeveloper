package JavaCoreFoundations.day1;

import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString method.
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    // Overriding the equals method to make sure that we compare content and not references.
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return this.age == person.age && this.name.equals(person.name);
    }

    // Overriding the hash method to make sure that the integer is going to be the one we need
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
