package es.jab.CalculadoraCommand;

import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos<T> {
	
    private static GestorMementos<MementoCalculadora> gestorMementos;
	
    private SortedMap<String, T> lista = new TreeMap<String, T>();
    
    
    public static GestorMementos<MementoCalculadora> getGestorMementosCalculadora(){
        if(GestorMementos.gestorMementos == null){
        	GestorMementos.gestorMementos = new GestorMementos<MementoCalculadora>();
        }
         return GestorMementos.gestorMementos;
    }
    

    public void addMemento(String key, T memento) {
        this.lista.put(this.lista.size() + ":" + key, memento);
    }

    public T getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keysMemento() {
        return this.lista.keySet().toArray(new String[0]);
    }

}
