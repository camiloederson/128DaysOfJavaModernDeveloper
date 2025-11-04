package JavaCoreFoundations;

import java.util.HashSet;
import java.util.Objects;

public class EqualsHashCodePractice {
    public static void main(String[] args){
        Person person1 = new Person("Carlos", 28);
        Person person2 = new Person("Carlos",28 );

        System.out.println(person1 == person2);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Overriding the toString method.
    @Override
    public String toString(){
        return "Person [name=" + name + ", age=" + age + "]";
    }

    // Overriding the equals method to make sure that we compare content and not references.
    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(! (o instanceof Person)) return false;
        Person person = (Person) o;
        return this.age == person.age && this.name.equals(person.name);
    }

    // Overriding the hash method to make sure that the integer is going to be the one we need
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}

