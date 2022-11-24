package factory;

import classes.BassGuitar;
import classes.ElectricGuitar;
import interfaces.Instrument;

public class InstrumentFactory {
    public Instrument createInstrument(int stringNumber) {
        switch(stringNumber) {
            case 4:
                return new BassGuitar();
            case 6:
                return new ElectricGuitar();
            default:
                throw new IllegalArgumentException("Unknown instrument");
        }
    }
}
