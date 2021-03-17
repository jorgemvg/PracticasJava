import static org.junit.Assert.*;

import org.junit.Test;

import edu.hackerrank.challenge.Day1;

public class Dia1Test {

	@Test
	public void testSuma() {
		int resultado = Day1.sumar(2, 3);
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testConcatenar() {
		String resultado = Day1.concatenar("Jorge", "Mario");
		String esperado = "JorgeMario";
		
		assertEquals(esperado, resultado);
	}
}
