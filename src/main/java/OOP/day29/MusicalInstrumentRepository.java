package OOP.day29;

import OOP.day28.MusicalInstrument;

public interface MusicalInstrumentRepository {
    public MusicalInstrument create(MusicalInstrument musicalInstrument); // MusicalInstrument is an interface
    public MusicalInstrument update(MusicalInstrument musicalInstrument, long id);
    public void deleteById(long id);
}
