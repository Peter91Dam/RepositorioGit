package ExEntornos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitEx {
	
	@After
	public void before() {
		System.out.println(" Esto es lo que sale \n");	
	}
	
	@Before
	public void after() {
		System.out.println(" Menú  \n");
		System.out.println(" 1.Calcular numero ");
		System.out.println(" 2.Calcular numero  \n ");
	}

	@Test
	public void metodoExamen1(){
		int resultado= ExamenED.metodoExamen(1);
		int esperado=1; // 
		assertEquals(esperado,resultado);
		System.out.println(" Esto es el resultado del numero: " + resultado);
		System.out.println(" Esto es el esperado del numero: " + esperado);
	}
	
	@Test
	public void  metodoExamen(){
		int resultado= ExamenED.metodoExamen(1);
		int esperado=1; // 
		assertEquals(esperado,resultado);
		System.out.println(" Esto es el resultado del numero: " + resultado);
		System.out.println(" Esto es el esperado del numero: " + esperado);
	}

}
