package classes;

import interfaces.Instrument;

public class BassGuitar implements Instrument {
    @Override
    public void tone() {
        System.out.println("Bass guitar has been tuned");

    }

    @Override
    public void playNote() {
        System.out.println("Do");
    }

    public void slap(){
        System.out.println("Slapped!");
    }

}
