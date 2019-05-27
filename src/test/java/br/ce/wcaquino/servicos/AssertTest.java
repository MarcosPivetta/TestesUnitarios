package br.ce.wcaquino.servicos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {

	@Test
	public void test() {
		assertTrue(true);
		assertFalse(false);
		
		assertEquals(1, 1);
		assertEquals(0.51, 0.51, 0.0001);
		assertEquals(Math.PI, 3.14, 0.01);
		
		int i = 5;
		Integer i2 = 5;
		assertEquals(Integer.valueOf(i), i2);
		assertEquals(i, i2.intValue());

		assertEquals("bola", "bola");
		assertNotEquals("bola", "Bola");
		assertTrue("bola".equalsIgnoreCase("Bola"));
		assertTrue("bola".startsWith("bo"));
		
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		Usuario u3 = null;
		
		assertEquals(u1, u2);
		assertSame(u2, u2);
		
		assertNull(u3);
		assertNotNull(u2);
		
		assertEquals("bola não está escrito corretamente", "bola", "Bola");

	}
}
