package es.jab.TextEditor;

public class Caracter extends Componente {
	
	private char letra;

	public Caracter(char letra) {
		this.letra = letra;
	}
	
	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public void add(Componente componente) {
	}

	@Override
	public void delete(Componente componente) {
	}

	@Override
	public String dibujar(boolean mayus) {
		if(mayus){
			return this.toString().toUpperCase(); 
		}
		else{
			return Character.toString(this.letra);
		}
	}
	
	@Override
	public String toString(){
		return this.toString();
	}
	
}
