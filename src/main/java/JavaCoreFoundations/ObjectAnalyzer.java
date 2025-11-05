package JavaCoreFoundations;

import java.util.Scanner;

public class ObjectAnalyzer {

    public static void main(String[] args) {

        Person person1 = createObject();
        Person person2 = createObject();

        // Reporting
        StringBuilder report = new StringBuilder();
        report.append("📝 \tREPORT\n");
        report.append("\tComparing two persons created from console input\n");
        boolean sameByReference = person1 == person2;
        report.append("🗝️ \t\tSame reference using == ? : " + sameByReference + "\n");
        boolean sameByContent = person1.equals(person2);
        report.append("Ⓜ️ \t\tSame by content using equals() ? : " + sameByContent + "\n");
        int hash1 = person1.hashCode();
        int hash2 = person2.hashCode();
        boolean sameHash = hash1 == hash2;
        report.append("🎞️ \t\tSame hashes ? : " + sameHash + "\n");
        report.append(("🚌 \t\tHashCode1: " + hash1 + " | Hash2: " + hash2));
        System.out.println(report);
    }

    public static Person createObject() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(null, 0);

        System.out.println("Escribe el nombre de la persona");
        person.name = scanner.next();
        System.out.println("Escribe la edad");
        person.age = scanner.nextInt();

        return person;
    }
}
