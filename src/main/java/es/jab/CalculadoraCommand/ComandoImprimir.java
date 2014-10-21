package es.jab.CalculadoraCommand;

import upm.jbb.IO;

public class ComandoImprimir implements Comando {

	private static final String name = "Imprimir";
	
	private Calculadora calculadora;
	private int resultado;

	public ComandoImprimir(Calculadora calc) {
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
		IO.out.println("=" + this.resultado);
	}

	@Override
	public String name() {
		return ComandoImprimir.name;
	}

}
