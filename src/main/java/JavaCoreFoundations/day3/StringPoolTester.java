package JavaCoreFoundations.day3;

public class StringPoolTester {
    public static void main(String[] args){

        // Creates two literal strings that lives in the String Pool
        String s1 = "Camilo";
        String s2 = "Camilo";

        // Compare the using ==
        System.out.print("📝 Is 's1' equals to 's2' using == to compare?: ");
        System.out.println(s1 == s2 ? "✅ True" : "❌ False");
        System.out.println("\t🧠 Explanation: Is true because they are the same bucket in the String Pool");
        System.out.print("\t\t🔢 's1' Identity HashCode: ");
        System.out.println(System.identityHashCode(s1));
        System.out.print("\t\t🔢 's2' Identity HashCode: ");
        System.out.println(System.identityHashCode(s2));

        // Creates a new String Object in the Heap
        String s3 = new String("Camilo");

        // Compares a String Pool variable with a Heap String variable with the same content
        System.out.print("📝 Is 's2' equals to 's3' using == to compare?: ");
        System.out.println(s2 == s3 ? "✅ True" : "❌ False");
        System.out.println("\t🧠 Explanation: Is false because one is in the Heap and another in the Pool");
        System.out.print("\t\t🔢 's2' Identity HashCode: ");
        System.out.println(System.identityHashCode(s2));
        System.out.print("\t\t🔢 's3' Identity HashCode: ");
        System.out.println(System.identityHashCode(s3));

        // Interns the Heap variable in the pool
        s3 = s3.intern();

        // Compares if the Heap variables now lives in the Pool
        System.out.print("📝 Is 's2' equals to 's3' using == to compare?: ");
        System.out.println(s2 == s3 ? "✅ True" : "❌ False");
        System.out.println("\t🧠 Explanation: Is true because s3 has been moved to the Pool");
        System.out.print("\t\t🔢 's2' Identity HashCode: ");
        System.out.println(System.identityHashCode(s2));
        System.out.print("\t\t🔢 's3' Identity HashCode: ");
        System.out.println(System.identityHashCode(s3));

    }
}
