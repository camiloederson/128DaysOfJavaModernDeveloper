package OOP.day25;

import JavaCoreFoundations.day14.Song;

import java.sql.Connection;

public class GodSongClass {
    private long id;
    private String name;
    private int durationInSecs;

    public GodSongClass(long id, String name, int durationInSecs) {
        this.id = id;
        if (name.isBlank()) throw new IllegalArgumentException("Invalid name");
        this.name = name;
        this.durationInSecs = durationInSecs;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInSecs() {
        return durationInSecs;
    }

    public void setDurationInSecs(int durationInSecs) {
        this.durationInSecs = durationInSecs;
    }

    public void connectToDatabase(){
        // creates connection to database
    }

    public String saveToDatabase(Song song){
        if (true) return "The song was saved";
        else return "Song was not saved";
    }

    public void validation(Song song){
        if (song.getArtist().isBlank()) {
            throw new IllegalArgumentException("Artist does not exist in DB");
        }
    }

    public void printSong(Song song){
        System.out.println(song.toString());
    }
}
