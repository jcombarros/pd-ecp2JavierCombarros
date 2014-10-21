package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoIniciar implements Comando {

	private static final String name = "Iniciar";
	
	private Calculadora calculadora;

	public ComandoIniciar(Calculadora calc) {
		this.calculadora = calc;
	}

	@Override
	public void ejecutar() {
		this.calculadora.iniciar();
		IO.out.println("\n---\n");
	}

	@Override
	public String name() {
		return ComandoIniciar.name;
	}

}
