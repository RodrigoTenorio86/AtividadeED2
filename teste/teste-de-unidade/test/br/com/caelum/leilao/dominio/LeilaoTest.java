package br.com.caelum.leilao.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeilaoTest {
	@Test
	public void deveReceberUmLance() {
		Leilao leilao = new Leilao("Mac");
		assertEquals(0, leilao.getLances().size());

		leilao.propoe(new Lance(new Usuario("Jose"), 1000));

		assertEquals(1, leilao.getLances().size());
		assertEquals(1000, leilao.getLances().get(0).getValor(), 0.0001);
	}

	@Test
	public void naoDeveAceitarDoisLanceSeguidosDoMesmoUsuario() {
		Leilao leilao = new Leilao("Mac");
		Usuario usuario = new Usuario("Jose");

		leilao.propoe(new Lance(usuario, 1000.0));
		leilao.propoe(new Lance(usuario, 2000.0));

		assertEquals(1, leilao.getLances().size());
		assertEquals(1000.0, leilao.getLances().get(0).getValor(), 0.0001);
	}

	@Test
	public void naoDeveAceitaMaisQueCincoLance() {
		Leilao leilao = new Leilao("Mac");

		Usuario usuario1 = new Usuario("Jose");
		Usuario usuario2 = new Usuario("maria");

		leilao.propoe(new Lance(usuario1, 1000));
		leilao.propoe(new Lance(usuario2, 2000));

		leilao.propoe(new Lance(usuario1, 3000));
		leilao.propoe(new Lance(usuario2, 4000));

		leilao.propoe(new Lance(usuario1, 5000));
		leilao.propoe(new Lance(usuario2, 6000));

		leilao.propoe(new Lance(usuario1, 7000));
		leilao.propoe(new Lance(usuario2, 8000));

		leilao.propoe(new Lance(usuario1, 8000));
		leilao.propoe(new Lance(usuario2, 9000));

		leilao.propoe(new Lance(usuario1, 10000));
		leilao.propoe(new Lance(usuario2, 20000));

		assertEquals(10, leilao.getLances().size());
		assertEquals(8000, leilao.getLances().get(leilao.getLances().size()-2).getValor(),0.0001);

	}
}
