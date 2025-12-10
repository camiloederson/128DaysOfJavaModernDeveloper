package JavaCoreFoundations.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("C:\\Users\\kmika\\OneDrive\\Desktop\\MyFirstTxtFile.txt"))) {
            writer.write("Hello.I'm writing my first .txt file!! Go Ahead MikDev!!");
            writer.newLine();
            writer.write("It was created on my BootCamp day 14");
            writer.newLine();
            writer.write("✅ Done!");
        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedReader bufferedReader = Files.newBufferedReader(Path.of("C:\\Users\\kmika\\OneDrive\\Desktop\\MyFirstTxtFile.txt"))){
            String line;
            int lineCounter = 1;
            while((line = bufferedReader.readLine())!= null){
                System.out.println("Linea " + lineCounter + " | " + line);
                lineCounter++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
