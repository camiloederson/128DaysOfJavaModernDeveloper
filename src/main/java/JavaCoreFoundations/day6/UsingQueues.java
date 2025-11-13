package JavaCoreFoundations.day6;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueues {
    public static void main(String[] args) {

        Queue<String> names = new LinkedList<>();

        names.offer("Camilo");
        names.offer("Ederson");
        names.offer("Castro");

        while (!names.isEmpty()){
            System.out.println("It's turn of: " + names.poll());
        }
    }
}
