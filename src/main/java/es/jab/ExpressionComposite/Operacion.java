package es.jab.ExpressionComposite;

public abstract class Operacion extends Expresion {

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public abstract int operate();

}
