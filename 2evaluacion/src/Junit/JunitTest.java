package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
	
	@After
	public void before() {
		System.out.println(" Esto es lo que sale compañero \n");	
	}
	
	@Before
	public void after() {
		System.out.println(" Menú  \n");
		System.out.println(" 1.Calcular área del cuadrado ");
		System.out.println(" 2.Calcular perímetro del cuadrado  \n ");
	}

	@Test
	public void testarea(){
		int resultado= Operaciones.areacuadrado(2,2);
		int esperado=4; // 2*2=4
		assertEquals(esperado,resultado);
		System.out.println(" Esto es el resultado del area: " + resultado);
		System.out.println(" Esto es el esperado del area: " + esperado);
	}
	
	@Test
	public void  testperimetro(){
		int resultado= Operaciones.perimetrocuadrado(2);
		int esperado=8; // 2*4=8
		assertEquals(esperado,resultado);
		System.out.println(" Esto es el resultado del perimetro: " + resultado);
		System.out.println(" Esto es el esperado del perimetro: " + esperado);
	}
	
	
	
	
	
}
