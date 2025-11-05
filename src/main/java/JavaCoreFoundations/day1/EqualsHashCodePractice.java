package JavaCoreFoundations.day1;

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

