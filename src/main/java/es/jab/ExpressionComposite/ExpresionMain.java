package es.jab.ExpressionComposite;

public class ExpresionMain {

	public static void main(String[] args) {
		Expresion exp1 = new Entero(4);
        Expresion exp2 = new Suma(exp1, new Entero(2));
        Expresion exp3 = new Resta(exp1, new Entero(3));
        Expresion exp4 = new Multiplicacion(exp1, new Entero(2));
        Expresion exp5 = new Division(exp1, new Entero(3));
        Expresion exp6 = new Suma(new Resta(new Entero(3), new Multiplicacion(
                new Division(exp1, new Entero(2)), new Entero(3))), exp1);
        
        System.out.println(exp6.toString() + ": " + exp6.operate());

	}

}
