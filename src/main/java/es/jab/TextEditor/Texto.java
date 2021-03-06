package es.jab.TextEditor;

import java.util.Iterator;

public class Texto extends ComponenteMulti{

	public Texto(){
		super();
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException{
		if(!componente.isComposite()){
			throw new UnsupportedOperationException();
		}
		else{
			this.caracteres.add(componente);
		}
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException{
		if(!componente.isComposite()){
			throw new UnsupportedOperationException();
		}
		else{
			Iterator<Componente> iterator = this.caracteres.iterator();
			while(iterator.hasNext()){
				Componente myComponente = iterator.next();
				if(myComponente.equals(componente)){
					this.caracteres.remove(componente);
				}
			}
		}
	}
	
	@Override
	public String toString(){
		StringBuilder parrafo = new StringBuilder();
		for (Componente componente : this.caracteres)
		{
			parrafo.append(((ComponenteMulti)componente).toString());
		}
		
		return parrafo.toString();
	}
	
	@Override
	public String dibujar(boolean mayus) {
		StringBuilder parrafo = new StringBuilder();
		if(mayus){
			parrafo.append(this.toString().toUpperCase());
		}
		else{
			parrafo.append(this.toString());
		}
		parrafo.append("---o---");
		parrafo.append("\n");
		
		return parrafo.toString();
	}

	
}
