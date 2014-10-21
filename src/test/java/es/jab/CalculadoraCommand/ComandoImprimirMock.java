package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoImprimirMock implements Comando {

	private static final String name = "Imprimir";
	
	private Calculadora calculadora;
	private int resultado;

	public ComandoImprimirMock(Calculadora calc) {
		this.calculadora = calc;
		this.setResultado(0);
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	@Override
	public void ejecutar() {
		this.resultado = this.calculadora.getTotal();
		System.out.println("=" + this.resultado);
	}

	@Override
	public String name() {
		return ComandoImprimirMock.name;
	}

}
