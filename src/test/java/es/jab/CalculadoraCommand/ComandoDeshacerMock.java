package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoDeshacerMock implements Comando {

private static final String name = "Deshacer";
	
	private CalculadoraMementable calculadora;

	public ComandoDeshacerMock(CalculadoraMementable calc) {
		this.calculadora = calc;
	}

	@Override
	public void ejecutar() {
		GestorMementos<MementoCalculadora> gestor = GestorMementos.getGestorMementosCalculadora();
		String memento = "0:1";
    	this.calculadora.restoreMemento(gestor.getMemento(memento));
    	IO.out.println("Recuperado: " + memento);

	}

	@Override
	public String name() {
		return ComandoDeshacerMock.name;
	}

}
