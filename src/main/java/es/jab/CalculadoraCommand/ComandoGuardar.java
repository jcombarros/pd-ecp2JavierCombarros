package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoGuardar implements Comando {

	private static final String name = "Guardar";
	
	private CalculadoraMementable calculadora;

	public ComandoGuardar(CalculadoraMementable calc) {
		this.calculadora = calc;
	}

	@Override
	public void ejecutar() {
		String memento = IO.in.readString("Nombre del Memento");
		GestorMementos.getGestorMementosCalculadora().addMemento(memento, calculadora.createMemento());
		IO.out.println("Guardado: " + memento);
	}

	@Override
	public String name() {
		return ComandoGuardar.name;
	}

}
