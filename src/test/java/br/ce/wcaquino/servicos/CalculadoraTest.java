package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class CalculadoraTest {

	private Calculadora calc;
	
	@Before
	public void setup() {
		calc = new Calculadora();
	}
	
	@Test
	public void deveSomarDoisValores() {
		//cenario
		int a, b;
		a = 5;
		b = 3;
		
		//acao
		int resultado = calc.somar(a, b);
		
		//verificao
		Assert.assertEquals(8, resultado);
	}
	
	@Test
	public void deveSubtrairDoisValore() {
		//cenario
		int a, b;
		a = 5;
		b = 3;
		
		//acao
		int resultado = calc.subtrair(a, b);
		
		//verificao
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		//cenario
		int a, b;
		a = 6;
		b = 3;
		
		//acao
		int resultado = calc.dividir(a, b);
		
		//verificao
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void deveMultiplicarDoisValores() {
		//cenario
		int a, b;
		a = 5;
		b = 3;
		
		//acao
		int resultado = calc.multiplicar(a, b);
		
		//verificao
		Assert.assertEquals(15, resultado);
	}
	
	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
		int a, b;
		a = 10;
		b = 0;
		
		calc.dividir(a, b);
	}
}
