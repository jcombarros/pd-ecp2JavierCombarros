package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoGuardarMock implements Comando {

private static final String name = "Guardar";
	
	private CalculadoraMementable calculadora;

	public ComandoGuardarMock(CalculadoraMementable calc) {
		this.calculadora = calc;
	}

	@Override
	public void ejecutar() {
		String memento = "1";
		GestorMementos.getGestorMementosCalculadora().addMemento(memento, calculadora.createMemento());
		IO.out.println("Guardado: " + memento);
	}

	@Override
	public String name() {
		return ComandoGuardarMock.name;
	}
}
