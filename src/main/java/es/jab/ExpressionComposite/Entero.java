package es.jab.ExpressionComposite;

public class Entero extends Expresion {
	
	private int valor;
	
	public Entero(int valor){
		this.valor = valor;
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public int operate() {
		return this.valor;
	}
	
	@Override
	public String toString(){
		return "" + this.valor;
	}

}
