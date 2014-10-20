package es.jab.TextEditor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parrafo extends ComponenteMulti {
	
	public Parrafo(){
		super();
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException{
		if(componente.isComposite()){
			throw new UnsupportedOperationException();
		}
		else{
			this.caracteres.add(componente);
		}
	}

	@Override
	public void delete(Componente componente) throws UnsupportedOperationException{
		if(componente.isComposite()){
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
			parrafo.append(((Caracter)componente).getLetra());
		}
		parrafo.append("/n");
		return parrafo.toString();
	}

}
