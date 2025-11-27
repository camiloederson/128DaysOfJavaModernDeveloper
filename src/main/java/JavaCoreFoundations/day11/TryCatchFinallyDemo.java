package JavaCoreFoundations.day11;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("TRY: Starting");
            String integer = "AAA";
            System.out.println(Integer.parseInt(integer));
        } catch (NumberFormatException e) {
            System.out.println("CATCH: Error was caught");
            throw new RuntimeException("Invalid input", e);
        } finally {
            System.out.println("FINALLY: Cleaning up");
        }
    }
}
