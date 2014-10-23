package es.jab.CalculadoraCommand;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	CalculadoraMementable calc;
	GestorComandos gestor;
	Comando comandoSumar;
	Comando comandoRestar;
	Comando comandoIniciar;
	Comando comandoImprimir;
	Comando comandoGuardar;
	Comando comandoDeshacer;
	
	@Before
	public void before(){
		calc = new CalculadoraMementable(1);
        gestor = new GestorComandos();
        comandoSumar = new ComandoSumarMock(calc);
        comandoRestar = new ComandoRestarMock(calc);
        comandoIniciar = new ComandoIniciarMock(calc);
        comandoImprimir = new ComandoImprimirMock(calc);
        comandoGuardar = new ComandoGuardarMock(calc);
        comandoDeshacer = new ComandoDeshacerMock(calc);
        
        gestor.add(comandoSumar);
        gestor.add(comandoRestar);
        gestor.add(comandoIniciar);
        gestor.add(comandoImprimir);
        gestor.add(comandoGuardar);
        gestor.add(comandoDeshacer);
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
		assertEquals(-2, calc.getTotal());
		
	}
	
	@Test
	public void IniciarTest() {
		gestor.execute("Sumar");
		gestor.execute("Iniciar");
		assertEquals(0, calc.getTotal());
		
	}
	
	@Test
	public void GuardarTest() {
		gestor.execute("Sumar");
		gestor.execute("Guardar");
		assertEquals(3, GestorMementos.getGestorMementosCalculadora().getMemento("0:1").getValor());
		
	}
	@Test
	public void DeshacerTest() {
		gestor.execute("Sumar");
		gestor.execute("Guardar");
		gestor.execute("Sumar");//6
		gestor.execute("Deshacer");
		assertEquals(3, calc.getTotal());
		
	}

}
