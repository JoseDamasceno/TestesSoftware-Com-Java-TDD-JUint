package com.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}
	
	@Test
	public void testesomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
	}
}
