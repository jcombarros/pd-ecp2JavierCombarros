package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoRestar implements Comando {
	
	private static final String name = "Restar";
	
	private Calculadora calculadora;
	private int valor;

	public ComandoRestar(Calculadora calc) {
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
		this.valor = IO.in.readInt("Introduzca valor a " + ComandoRestar.name);
		this.calculadora.restar(this.valor);
		IO.out.println("-" + this.valor);
	}

	@Override
	public String name() {
		return ComandoRestar.name;
	}

}
