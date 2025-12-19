package OOP.day28;

public class Tambourine  implements MusicalInstrument{

    int volume;

    @Override
    public void makeSound() {
        System.out.println("Tss");
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
        throw new IllegalStateException("It can't be tuned");
    }
}
