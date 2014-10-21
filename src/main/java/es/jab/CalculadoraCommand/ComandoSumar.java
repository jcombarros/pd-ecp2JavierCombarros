package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoSumar implements Comando {

	private static final String name = "Sumar";
	
	private Calculadora calculadora;
	private int valor;

	public ComandoSumar(Calculadora calc) {
		this.calculadora = calc;
		this.valor = 0;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public void ejecutar() {
		this. valor = IO.in.readInt("Introduzca valor a " + ComandoSumar.name);
		this.calculadora.sumar(this.valor);
		IO.out.println("+" + this.valor);
	}

	@Override
	public String name() {
		return ComandoSumar.name;
	}

}
