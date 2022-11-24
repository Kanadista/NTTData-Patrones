package classes;

import interfaces.Instrument;

public class ElectricGuitar implements Instrument {
    @Override
    public void tone() {
        System.out.println("Electric guitar has been tuned");

    }

    @Override
    public void playNote() {
        System.out.println("Do");
    }

}
