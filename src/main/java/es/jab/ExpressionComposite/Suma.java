package es.jab.ExpressionComposite;

public class Suma extends Operacion {
	
	public Suma(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operate() {
		return this.exp1.operate() + this.exp2.operate();
	}
	
	@Override
	public String toString(){
		return "(" + this.exp1.toString() + "+" + this.exp2.toString() + ")";
	}

}
