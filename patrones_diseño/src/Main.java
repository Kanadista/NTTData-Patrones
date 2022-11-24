import factory.InstrumentFactory;
import interfaces.Instrument;
import iterators.MusicTabIterator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String [] args){
        InstrumentFactory factory = new InstrumentFactory();
        Instrument instrument = factory.createInstrument(4); // Ejemplo del factory, si lo cambiamos a 6 será una guitarra eléctrica
        List<String> musicTab = Arrays.asList("Re", "Mi", "Fa", "Si", "La", "Sol"); // Lleno una partitura para comprobar el iterator
        MusicTabIterator mIterator = new MusicTabIterator(musicTab);


        instrument.tone();
        instrument.playNote();

        while(mIterator.hasNext()){ // Prueba del iterator
            System.out.print(mIterator.getNext() + " ");
        }
    }
}
