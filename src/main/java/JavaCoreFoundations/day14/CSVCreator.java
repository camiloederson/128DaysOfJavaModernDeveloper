package JavaCoreFoundations.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVCreator {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of("C:\\Users\\kmika\\OneDrive\\Desktop\\songs.csv"))) {
            bufferedWriter.write("Yesterday,The Beatles,2.05");
            bufferedWriter.newLine();
            bufferedWriter.write("Africa,Toto,4.22");
            bufferedWriter.newLine();
            bufferedWriter.write("Smooth,Santana,4.0");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = Files.newBufferedReader(Path.of("C:\\Users\\kmika\\OneDrive\\Desktop\\songs.csv"))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                Song song = new Song(parts[0], parts[1], Double.parseDouble(parts[2]));
                System.out.println(song.toString());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
