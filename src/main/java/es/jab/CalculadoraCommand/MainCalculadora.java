package es.jab.CalculadoraCommand;

import upm.jbb.IO;


public class MainCalculadora {
	private GestorComandos gestor;
    private CalculadoraMementable calcMementable;
    
    public MainCalculadora() {
    	this.calcMementable = new CalculadoraMementable(1);
        this.gestor = new GestorComandos();
        
        this.gestor.add(new ComandoSumar(calcMementable));
        this.gestor.add(new ComandoRestar(calcMementable));
        this.gestor.add(new ComandoIniciar(calcMementable));
        this.gestor.add(new ComandoImprimir(calcMementable));
        this.gestor.add(new ComandoGuardar(calcMementable));
        this.gestor.add(new ComandoDeshacer(calcMementable));
       
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        if(key != null){
        	this.gestor.execute(key);
        }
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
