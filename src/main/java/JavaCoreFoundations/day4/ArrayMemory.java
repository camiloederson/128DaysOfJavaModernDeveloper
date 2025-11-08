package JavaCoreFoundations.day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMemory {
    public static void main(String[] args){
        System.out.println("-----------------------------------------");
        System.out.println("🖥️ Proving how arrays work in memory");
        System.out.println("-----------------------------------------");
        String[] array = {"Carlos", "Maria", "Mario"};
        String[] arrayReferenceCopy = array;
        String[] arrayCopyByClone = array.clone();

        System.out.println("🔢 The original array: #"+ array.hashCode());
        System.out.println("\t✅ The original reference");
        System.out.println("🔢 The array copied by reference: #"+ arrayReferenceCopy.hashCode());
        System.out.println("\t🟰 The same number of reference");
        System.out.println("🔢 The array copied using .clone(): #" + arrayCopyByClone.hashCode());
        System.out.println("\t🆎 Another number of reference");
        System.out.println("🔢 The array copied using Arrays.copyOf(): #" + Arrays.copyOf(array, array.length).hashCode());
        System.out.println("\t🆎 Another number of reference");
    }
}
