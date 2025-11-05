package JavaCoreFoundations.day1;

public class MemoryDemo {
    public static void main(String[] args){

        String string1 = "String";
        String string2 = "String";

        String string3 = new String("NewString");
        String string4 = new String("NewString");

        Person person1 = new Person("Camilo", 38);
        Person person2 = new Person("Camilo", 38);

        StringBuilder stringBuilder = new StringBuilder("sb");

        // Comparing == and equals
        System.out.println(string1 == string2); // should be true because of the Spring Pool
        System.out.println(string3 == string4); // should be false

        System.out.println(string1.equals(string2)); // should be true
        System.out.println(string3.equals(string4)); // should be true

        System.out.println(string1.hashCode());
        string1 += " concatenated";
        System.out.println(string1.hashCode());

        // Demonstrating StringBuilder mutability
        System.out.println(string3.hashCode()); // hashCode of a SB string
        string3.concat(" concatenated"); // should print the same hash
        System.out.println(string3.hashCode());




    }
}
