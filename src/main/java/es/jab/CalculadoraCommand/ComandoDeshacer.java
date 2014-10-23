package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoDeshacer implements Comando {

	private static final String name = "Deshacer";
	
	private CalculadoraMementable calculadora;

	public ComandoDeshacer(CalculadoraMementable calc) {
		this.calculadora = calc;
	}

	@Override
	public void ejecutar() {
		GestorMementos<MementoCalculadora> gestor = GestorMementos.getGestorMementosCalculadora();
		String memento = (String) IO.in.select(gestor.keysMemento(), "Restaurar");
    	this.calculadora.restoreMemento(gestor.getMemento(memento));
    	IO.out.println("Recuperado: " + memento);

	}

	@Override
	public String name() {
		return ComandoDeshacer.name;
	}

}
