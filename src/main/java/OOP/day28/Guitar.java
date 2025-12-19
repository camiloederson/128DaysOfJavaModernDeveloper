package OOP.day28;

public class Guitar implements MusicalInstrument, Tunable {

    int volume;

    public Guitar(int volume) {
        this.volume = volume;
    }

    @Override
    public void makeSound() {
        System.out.println("Plimmm");
    }

    @Override
    public boolean isSounding() {
        return false;
    }

    @Override
    public int turnUp() {
        return volume + 2;
    }

    @Override
    public int turnDown() {
        return volume - 2;
    }

    @Override
    public void tune() {
        System.out.println("Let's tune tune the guitar");
    }
}
