package JavaCoreFoundations.day2;

public class IntegerCacheProof {
    public static void main(String[] args){
        Integer a = 127;
        Integer b = 127;

        System.out.print(a + " == " + b + " is true because of the integer cache. They are the same object. 📝 ");
        System.out.println(a == b);
        System.out.print("And when we compare their values using equals, it gives true. 📝 ");
        System.out.println(a.equals(b));

        Integer c = 128;
        Integer d = 128;

        System.out.print(c + " == " + d + " is false because integer cache doesn't cover more than 127. JVM creates a new object. 📝 ");
        System.out.println(c == d);
        System.out.print("But when we compare their values using equals, it gives true, because equals compares the values. 📝");
        System.out.println(c.equals(d));
}
}
