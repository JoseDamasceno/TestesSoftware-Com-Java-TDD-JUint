package com.teste;

public class CalculadoraNova {

	public int somar(int... valores) {
		int soma = 0;
		for (int valor : valores) {
			soma += valor;
		}
		return soma;
	}

	public int subt(int... valores) {
		int sub = 0;
		for (int valor : valores) {
			sub -= valor;
		}
		return sub;

	}

	public int dividir(int ...valores) {
			int div = 0;
			for (int valor : valores) {
				div /= valor;
			}
			return div;}

	public double dividird(double... valores) {
		double divd = 0d;
		for (double valor : valores) {
			divd /= valor;
		}
		return divd;}
		
		public int multiplicar(int... valores) {
			int multp = 0;
			for (int valor : valores) {
				multp *= valor;
			}
			return multp;
		}

	}

