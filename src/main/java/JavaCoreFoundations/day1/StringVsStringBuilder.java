package JavaCoreFoundations.day1;

public class StringVsStringBuilder {
    public static void main(String[] args){
        compareStrings();
    }

    public static void compareStrings(){
        long start = System.currentTimeMillis();
        String cadenaString = "";
        for (int i = 0; i < 10000; i++) {
            cadenaString += "palabra" + i + " ";
        }
        long end = System.currentTimeMillis();
        System.out.println(cadenaString);
        System.out.println(end - start);
    }
}
