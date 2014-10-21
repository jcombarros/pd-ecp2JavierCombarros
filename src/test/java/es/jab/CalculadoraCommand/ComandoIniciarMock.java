package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoIniciarMock implements Comando {

	private static final String name = "Iniciar";
	
	private Calculadora calculadora;

	public ComandoIniciarMock(Calculadora calc) {
		this.calculadora = calc;
	}

	@Override
	public void ejecutar() {
		this.calculadora.iniciar();
		System.out.println("\n---\n");
	}

	@Override
	public String name() {
		return ComandoIniciarMock.name;
	}

}
