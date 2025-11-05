package JavaCoreFoundations.day2;

public class AutoboxingPerformance {
    public static void main(String[] args){
        long start, end, result;

        // creating a primitive variable to accumulate
        long primitiveAccumulator = 0;

        // setting up the milliseconds to compare later
        start = System.currentTimeMillis();
        for (long i = 0; i < 10000000 ; i++) {
            primitiveAccumulator +=1;
        }

        // storaging the top value in milliseconds to calculate the time
        end = System.currentTimeMillis();

        System.out.print("Milliseconds time spent using primitives inside the loop: ⏱️ ");
        result = end - start;
        System.out.println(result);

        // reassigning the start
        start = System.currentTimeMillis();

        // creating a wrapper variable to test its work
        Long wrappedAcumulator = 0L;
        for (int i = 0; i < 10000000; i++) {
            wrappedAcumulator +=1;
        }

        // storaging the new exit value of System.currentTime
        end = System.currentTimeMillis();

        System.out.print("Milliseconds time spent using Objects inside the loop: ⏱️ ");
        result = end - start;
        System.out.println(result);
    }
}
