package es.jab.CalculadoraCommand;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;
	GestorComandos gestor;
	Comando comandoSumar;
	Comando comandoRestar;
	Comando comandoIniciar;
	Comando comandoImprimir;
	
	@Before
	public void before(){
		calc = new Calculadora();
        gestor = new GestorComandos();
        comandoSumar = new ComandoSumarMock(calc);
        comandoRestar = new ComandoRestarMock(calc);
        comandoIniciar = new ComandoIniciarMock(calc);
        comandoImprimir = new ComandoImprimirMock(calc);
        
        gestor.add(comandoSumar);
        gestor.add(comandoRestar);
        gestor.add(comandoIniciar);
        gestor.add(comandoImprimir);
	}
	
	@Test
	public void SumaTest() {
		gestor.execute("Sumar");
		assertEquals(3, calc.getTotal());
		
	}
	
	@Test
	public void RestarTest() {
		gestor.execute("Restar");
		assertEquals(-8, calc.getTotal());
		
	}
	
	@Test
	public void OperacionTest() {
		gestor.execute("Sumar");
		gestor.execute("Sumar");
		gestor.execute("Restar");
		assertEquals(5, calc.getTotal());
		
	}
	
	@Test
	public void IniciarTest() {
		gestor.execute("Sumar");
		gestor.execute("Iniciar");
		assertEquals(0, calc.getTotal());
		
	}

}
