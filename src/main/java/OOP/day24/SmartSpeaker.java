package OOP.day24;

public class SmartSpeaker extends Speaker {
    public SmartSpeaker(int volume) {
        super(volume);
    }

    public void mute() {
        while (super.getVolume() > 0) {
            super.decreaseVolume();
        }
    }

    @Override
    public void increaseVolume() {
        super.increaseVolume();      // always safe first step

        if (getVolume() < 100) {
            super.increaseVolume();  // second step only if possible
        }
    }
}
