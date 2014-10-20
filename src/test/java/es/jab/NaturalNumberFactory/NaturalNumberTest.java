package es.jab.NaturalNumberFactory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberTest {

	private NaturalNumberManager naturalNumberManager;
	
	@Before
	public void before(){
		NaturalNumberCreator creator = new NaturalNumberES();
		naturalNumberManager = new NaturalNumberManager();
		naturalNumberManager.setCreator(creator);
	}
	
	@Test
	public void createNaturalNumberTest1(){
		naturalNumberManager.createNaturalNumber();
		assertEquals(new NaturalNumberES(), naturalNumberManager.getNaturalNumber());
	}
	
	@Test
	public void createNaturalNumberTest2(){
		naturalNumberManager.createNaturalNumber();
		
		naturalNumberManager.setCreator(new NaturalNumberFr());
		naturalNumberManager.createNaturalNumber();
		assertEquals(new NaturalNumberFr(), naturalNumberManager.getNaturalNumber());
	}
	
	@Test
	public void createNaturalNumberTest3(){
		naturalNumberManager.createNaturalNumber();
		NaturalNumber naturalNumber = naturalNumberManager.getNaturalNumber();
		naturalNumber.setValue(2);
		
		assertEquals("uno", naturalNumber.getTextValue());
	}

}
