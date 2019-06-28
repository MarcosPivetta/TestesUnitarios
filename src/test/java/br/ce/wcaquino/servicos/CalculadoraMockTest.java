package br.ce.wcaquino.servicos;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculadoraMockTest {

	@Test
	public void teste() {
		Calculadora calculadora = Mockito.mock(Calculadora.class);
		when(calculadora.somar(1, 2)).thenReturn(5);
		
		System.out.println(calculadora.somar(1, 8));
	}
}
