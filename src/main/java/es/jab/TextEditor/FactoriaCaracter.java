package es.jab.TextEditor;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factoriaCaracter;
	
	private Map<Character, Caracter> map;
	
	public FactoriaCaracter(){
		this.map = new HashMap<Character, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria(){
		if (FactoriaCaracter.factoriaCaracter == null){
			FactoriaCaracter.factoriaCaracter = new FactoriaCaracter();
		}
		return FactoriaCaracter.factoriaCaracter;
	}
	
	public Caracter get(Character key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
        	Caracter caracter = new Caracter(key);
            map.put(key, caracter);
            return caracter;
        }
    }

}
