package JavaCoreFoundations.day5;

import java.util.Objects;

public class Song {
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
        return id == song.id && duration == song.duration && Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && Objects.equals(genre, song.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, artist, genre, duration);
    }
}
