package JavaCoreFoundations.day4;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args){
        int[] unsortedNumbers = new int[15];

        // creates an int array with random numbers
        for (int i = 0; i < unsortedNumbers.length; i++) {
            unsortedNumbers[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(unsortedNumbers));

        // sorts the array
        Arrays.sort(unsortedNumbers);

        // prints the sorted array
        System.out.println(Arrays.toString(unsortedNumbers));

        // creates a bigger copy an fulls it with 0's
        int[] biggerArray = Arrays.copyOf(unsortedNumbers, 30);
        Arrays.fill(biggerArray, 15, 30, 0);
        System.out.println(Arrays.toString(biggerArray));

        // compares the first and last array
        System.out.println(Arrays.equals(unsortedNumbers, biggerArray));

    }
}
