package es.jab.TextEditor;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factoriaCaracter;
	
	public FactoriaCaracter(){
		
	}
	
	public static FactoriaCaracter getFactoria(){
		if (FactoriaCaracter.factoriaCaracter == null){
			FactoriaCaracter.factoriaCaracter = new FactoriaCaracter();
		}
		return FactoriaCaracter.factoriaCaracter;
	}

}
