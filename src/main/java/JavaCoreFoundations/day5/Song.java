package JavaCoreFoundations.day5;

import java.util.Objects;

public class Song implements Comparable<Song> {
    private long id;
    private String title;
    private String artist;
    private String genre;
    private int duration;

    public Song(long id, String title, String artist, String genre, int duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Song song)) return false;
        return Objects.equals(title, song.title) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }

    @Override
    public String toString() {
        return "Song{" +
                "\n 🔢id= \t" + id +
                ",\n 🆎 title= \t" + title  +
                ", \n 🤠 artist= \t" + artist +
                ", \n ✍️ genre= \t" + genre +
                ", \n ⏱️ duration= \t" + duration +
                '}';
    }

    @Override
    public int compareTo(Song song) {
        // stores in result
            // 0 if are equals
            // 1 if the title passed as a parameter goes after alphabetically
            // -1 if the title passed as a parameter goes before alphabetically
        int result = this.title.compareTo(song.title);
        // if the result is different from zero, doesnt enter to the if and...
        if(result == 0){
            // 0 if are equals
            // 1 if this.artist name goes after alphabetically
            // -1 if this.artist name goes before alphabetically
            result = this.artist.compareTo((song.artist));
        }
        // ... returns 0, - 1 or 1
        return result;
    }
}
