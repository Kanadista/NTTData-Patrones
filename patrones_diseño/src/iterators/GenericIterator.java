package iterators;

public interface GenericIterator { //Pienso que es buena idea hacerlo genérico por si tienes más de un iterator
    boolean hasNext();

    String getNext();
}
