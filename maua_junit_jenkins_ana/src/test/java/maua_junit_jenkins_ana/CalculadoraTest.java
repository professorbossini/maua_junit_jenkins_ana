package maua_junit_jenkins_ana;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	private int n1 = 2;
	private int n2 = 2;
	private int resultadoEsperado = 4;

	@Test
	public void teste () {
		Calculadora calculadora = new Calculadora ();
		assertEquals(resultadoEsperado, calculadora.soma(n1, n2));
	}
	
	
	@Test
	public void testeMultiplicacao (int a, int b) {
		Calculadora calculadora = new Calculadora ();
		assertEquals(resultadoEsperado, calculadora.multiplicacao(a, b));
		
	}
	
	
}
