package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeleilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class TesteDoAvaliador {

	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;

	@Before
	public void criaAvaliador() {
		this.leiloeiro = new Avaliador();
		System.out.println("Cria avaliador");

		this.joao = new Usuario("joao");
		this.jose = new Usuario("jose");
		this.maria = new Usuario("maria");
	}

	@Test
	public void deveEntenderLanceEmOrdem() {
		// 1:Cenario
		Usuario joao = new Usuario("joao");
		Usuario jose = new Usuario("jose");
		Usuario maria = new Usuario("maria");

		Leilao leilao = new Leilao("Casa");

		leilao.propoe(new Lance(maria, 1000));
		leilao.propoe(new Lance(jose, 8000));
		leilao.propoe(new Lance(joao, 10));
		// 2 :acao
		leiloeiro.avalia(leilao);
		// 3: validaçao
		System.out.println(leiloeiro.getMaiorLance());
		assertEquals(8000, leiloeiro.getMaiorLance(), 0.0001);
		assertEquals(10, leiloeiro.getMenorLance(), 0.0001);
	}

	@Test
	public void deveEncontrarOsMaioresLances() {
		// 1:Cenario

		// Leilao leilao = new Leilao("Casa");

		// leilao.propoe(new Lance(maria, 1000));
		// leilao.propoe(new Lance(jose, 8000));
		// leilao.propoe(new Lance(joao, 10));

		Leilao leilao = new CriadorDeleilao().para("Casa")
				.lance(this.joao, 2000)
				.lance(this.maria, 4000)
				.lance(joao, 1000.0)
				.constroi();

		leiloeiro.avalia(leilao);

		List<Lance> maiores = leiloeiro.getTresMaiores();

		assertEquals(3, maiores.size());
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveAvaliarLeilaoSemNenhumLanceDado(){
		Leilao leilao=new CriadorDeleilao().para("casa").constroi();
		
		leiloeiro.avalia(leilao);
		
		
	}
}
