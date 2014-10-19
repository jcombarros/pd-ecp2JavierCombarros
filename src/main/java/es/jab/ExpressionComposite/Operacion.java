package es.jab.ExpressionComposite;

public abstract class Operacion extends Expresion {
	
	protected Expresion exp1;
	protected Expresion exp2;
	
	public Operacion(Expresion exp1, Expresion exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public abstract int operate();

}
