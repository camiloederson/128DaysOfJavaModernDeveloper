package JavaCoreFoundations.day4;

public class JaggedArrayDemo {
    public static void main(String[] args){
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        int counter = 1;
        for (int i = 0; i < jagged.length ; i++) {
            for (int j = 0; j < jagged[i].length ; j++) {
                jagged[i][j] = counter++;
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
