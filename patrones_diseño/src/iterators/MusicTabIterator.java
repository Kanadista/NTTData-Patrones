package iterators;

import java.util.List;

public class MusicTabIterator implements GenericIterator {
    private List<String> notes;
    private int currentPosition = 0;

    public MusicTabIterator(List<String> notes){
        this.notes = notes;
    }

    @Override
    public boolean hasNext() { //Compruebo si el siguiente item existe para controlar excepciónes de out of bounds
        return currentPosition < notes.size();
    }

    @Override
    public String getNext() {
        String note = "";
        if(!hasNext()){ // Compruebo que el siguiente exista.
            return null;
        }else{
            note = notes.get(currentPosition); // Asigno el elemento actual a un string
            currentPosition++; // Incremento el contador global
            return note;
        }
    }
}
