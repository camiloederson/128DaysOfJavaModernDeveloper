package OOP.day29;

import OOP.day28.MusicalInstrument;

public class MusicalInstrumentService implements MusicalInstrumentRepository {

    MusicalInstrumentRepository musicalInstrumentRepository;

    public MusicalInstrumentService(MusicalInstrumentRepository musicalInstrumentRepository) {
        this.musicalInstrumentRepository = musicalInstrumentRepository;
    }

    // I got it!! Tha bad practice would be:
    // MusicalInstrument miRepository = new MusicalInstrumentRepository();
    // .. because im creating the instance inside the client code.

    @Override
    public MusicalInstrument create(MusicalInstrument musicalInstrument) {
        return null;
    }

    @Override
    public MusicalInstrument update(MusicalInstrument musicalInstrument, long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {
    }
}
