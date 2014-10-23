package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoRestarMock implements Comando {
	
	private static final String name = "Restar";
	
	private Calculadora calculadora;
	private int valor;

	public ComandoRestarMock(Calculadora calc) {
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
		this.valor = 8;
		this.calculadora.restar(this.valor);
	}

	@Override
	public String name() {
		return ComandoRestarMock.name;
	}

}
