package es.jab.CalculadoraCommand;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
