package OOP.day24;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("The value should be between 0 and 100");
        }
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume >= 100) {
            throw new IllegalStateException("I dont know that to say!!");
        }
        this.volume++;
    }

    public void decreaseVolume() {
        if (volume <= 0) {
            throw new IllegalStateException("Volume is too low");
        }
        this.volume--;
    }
}
