package com.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {
	
	@Test
	public void DeveSomarDoisValores() {
		int valorA = 1;
		int valorB = 2; 
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA,valorB);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void DeveSomartresValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA,valorB,valorC);
		
		assertEquals(6, soma);

	}
	@Test
	public void DeveSomarQuatroValores() {
		int valorA = 1;
		int valorB = 2;
		int valorC = 3;
		int valorD = 10;
		
		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(valorA,valorB,valorC,valorD);
		
		assertEquals(16, soma);}
	
	@Test
	public void DeveSubtTresValores() {
		
		int valorC = 1;
		int valorD = 2;
		int valorE = 3;
		
		CalculadoraNova calc = new CalculadoraNova();
		int sub = calc.subt(valorC,valorD,valorE);
		
		assertEquals(-6, sub);}
	
	@Test
	public void DeveSubt4Valores() {
		
		int valorC = 2;
		int valorD = 2;
		int valorE = 3;
		int valorF = 10;
		
		CalculadoraNova calc = new CalculadoraNova();
		int sub = calc.subt(valorC,valorD,valorE,valorF);
		
		assertEquals(-17, sub);}
	
	@Test
	public void DeveDivi4Valores() {
		
		int valorC = 2;
		int valorD = 2;
		int valorE = 3;
		int valorF = 10;
		
		CalculadoraNova calc = new CalculadoraNova();
		int div = calc.dividir(valorC,valorD,valorE,valorF);
		
		assertEquals(0, div);}
	
	@Test
	public void DeveDivi4ValoresDouble() {
		
		int valorC = 10;
		int valorD = 15;
		int valorE = 30;
		int valorF = 40;
		
		CalculadoraNova calc = new CalculadoraNova();
		double div = calc.dividir(valorC,valorD,valorE,valorF);
		
		assertEquals(0.0d, div);}
	
	@Test
	public void DeveMultplicarTresValores() {
		int valorA = 2;
		int valorB = 4; 
		int valorC = 2;
		
		CalculadoraNova calc = new CalculadoraNova();
		int multip = calc.multiplicar(valorA,valorB,valorC);
		
		assertEquals(0, multip);
	}
	
	
}
