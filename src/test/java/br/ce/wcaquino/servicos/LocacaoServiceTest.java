package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static br.ce.wcaquino.utils.DataUtils.obterDataComDiferencaDias;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

public class LocacaoServiceTest {

	@Rule
	public ErrorCollector error =  new ErrorCollector();
	
	@Test
	public void testeLocacao() {
		//cenario
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		
		//acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		//verificacao
		assertEquals(5.0, locacao.getValor(), 0.01);
		error.checkThat(locacao.getValor(), is(5.0));
		error.checkThat(locacao.getValor(), is(not(6.0)));

		
		assertTrue(isMesmaData(locacao.getDataLocacao(), new Date()));
		error.checkThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(false));
		
		assertTrue(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)));
		error.checkThat(isMesmaData(locacao.getDataRetorno(), obterDataComDiferencaDias(1)), is(false));


	}
}
