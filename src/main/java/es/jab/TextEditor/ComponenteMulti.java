package es.jab.TextEditor;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponenteMulti extends Componente {
	
	protected List<Componente> caracteres;
	
	public ComponenteMulti() {
		this.caracteres = new ArrayList<Componente>();
	}

	public List<Componente> getCaracteres() {
		return caracteres;
	}

	public void setCaracteres(List<Componente> caracteres) {
		this.caracteres = caracteres;
	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public abstract void add(Componente componente);

	@Override
	public abstract void delete(Componente componente);


	@Override
	public String dibujar(boolean mayus) {
		if(mayus){
			return this.toString().toUpperCase();
		}
		else{
			return this.toString();
		}
	}

}
