package JavaCoreFoundations;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class day14 {
    public static void main(String[] args) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("C:\\Users\\kmika\\OneDrive\\Desktop\\MyFirstTxtFile.txt"))) {
            writer.write("Hello.I'm writing my first .txt file!! Go Ahead MikDev!!");
            ;
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
