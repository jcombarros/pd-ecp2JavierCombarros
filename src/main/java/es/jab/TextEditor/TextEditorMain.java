package es.jab.TextEditor;

public class TextEditorMain {

	public static void main(String[] args) {
		Componente H = FactoriaCaracter.getFactoria().get('H');
		Componente o = FactoriaCaracter.getFactoria().get('o');
		Componente l = FactoriaCaracter.getFactoria().get('l');
		Componente a = FactoriaCaracter.getFactoria().get('a');
		Componente pf = new Parrafo();
		 pf.add(H);
		 pf.add(o);
		 pf.add(l);
		 pf.add(a);
		Componente txt = new Texto();
		 txt.add(pf);
		 txt.add(pf);
		 
		 System.out.println("Caracter: " + H.dibujar(true));
		 
		 System.out.println("Conjunto de Caracteres: " 
				 + H.dibujar(false) 
				 + o.dibujar(false) 
				 + l.dibujar(false) 
				 + a.dibujar(false));
		 
		 System.out.println("Parrafo: " + pf.dibujar(true));
		 
		 System.out.println("Texto: " + txt.dibujar(true));
	}

}
