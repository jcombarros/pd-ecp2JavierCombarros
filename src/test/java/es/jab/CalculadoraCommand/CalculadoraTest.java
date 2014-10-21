package es.jab.CalculadoraCommand;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;
	GestorComandos gestor;
	ComandoSumar comandoSumar;
	ComandoRestar comandoRestar;
	ComandoIniciar comandoIniciar;
	ComandoImprimir comandoImprimir;
	
	@Before
	public void before(){
		calc = new Calculadora();
        gestor = new GestorComandos();
        comandoSumar = new ComandoSumar(calc);
        comandoRestar = new ComandoRestar(calc);
        comandoIniciar = new ComandoIniciar(calc);
        comandoImprimir = new ComandoImprimir(calc);
        
        gestor.add(comandoSumar);
        gestor.add(comandoRestar);
        gestor.add(comandoIniciar);
        gestor.add(comandoImprimir);
	}
	
	@Test
	public void SumaTest() {
		comandoSumar.setValor(3);
		gestor.execute("Sumar");
		assertEquals(3, calc.getTotal());
		
	}
	
	@Test
	public void RestarTest() {
		comandoRestar.setValor(8);
		gestor.execute("Restar");
		assertEquals(-8, calc.getTotal());
		
	}
	
	@Test
	public void OperacionTest() {
		comandoSumar.setValor(6);
		gestor.execute("Sumar");
		comandoSumar.setValor(3);
		gestor.execute("Sumar");
		comandoRestar.setValor(4);
		gestor.execute("Restar");
		assertEquals(5, calc.getTotal());
		
	}
	
	@Test
	public void IniciarTest() {
		comandoSumar.setValor(6);
		gestor.execute("Sumar");
		gestor.execute("Iniciar");
		assertEquals(0, calc.getTotal());
		
	}

}
