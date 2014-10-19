package es.jab.ExpressionComposite;

public class Division extends Operacion {

	public Division(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operate() {
		return this.exp1.operate() / this.exp2.operate();
	}


}
