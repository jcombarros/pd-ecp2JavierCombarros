package es.jab.CalculadoraCommand;

import upm.jbb.IO;


public class MainCalculadora {
    private GestorComandos gestor;

    public MainCalculadora() {
        Calculadora calc = new Calculadora();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumarMock(calc));
        this.gestor.add(new ComandoRestarMock(calc));
        this.gestor.add(new ComandoIniciarMock(calc));
        this.gestor.add(new ComandoImprimirMock(calc));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}
