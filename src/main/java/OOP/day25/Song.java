package OOP.day25;

public class Song {
    private long id;
    private String name;
    private int durationInSec;

    public Song(String name, int durationInSec) {
        this.name = name;
        this.durationInSec = durationInSec;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSec() {
        return durationInSec;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInSec(int durationInSec) {
        this.durationInSec = durationInSec;
    }
}
