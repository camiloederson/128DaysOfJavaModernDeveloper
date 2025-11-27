package JavaCoreFoundations.day11;

public class ExceptionChaining {
    public static void main(String[] args) {
        // Sometimes it's gonna throw an exception:
        fillArray();
    }

    public static void fillArray(){
        try {
            method1();
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("Hey There!!", e);
        }
    }

    public static void method1() throws IndexOutOfBoundsException{
        int[] numbers = new int[5];
        int index = ((int) (Math.random() * 10));
        for (int i = 0; i < index; i++) {
            numbers[i] = i + 1;
        }
    }

}
