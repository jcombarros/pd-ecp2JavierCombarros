package es.jab.CalculadoraCommand;

public class CalculadoraMementable extends Calculadora implements Mementable<MementoCalculadora> {
    private int id;

    public CalculadoraMementable(int id) {
    	super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(this.total);
    }

    @Override
    public void restoreMemento(MementoCalculadora memento) {
        this.setTotal(memento.getValor());
    }

}
