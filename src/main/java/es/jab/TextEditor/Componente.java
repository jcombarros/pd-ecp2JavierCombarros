package es.jab.TextEditor;

public abstract class Componente {

	public abstract boolean isComposite();
	
	public abstract void add(Componente componente);
	
	public abstract void delete(Componente componente);
	
	public abstract String dibujar(boolean mayus);
	
}
