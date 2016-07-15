package br.com.caelum.leilao.builder;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class CriadorDeleilao {

	private Leilao leilao;

	public CriadorDeleilao para(String descricao) {
		// TODO Auto-generated method stub
		this.leilao = new Leilao(descricao);
		return this;
	}

	public CriadorDeleilao lance(Usuario usuario, double valor) {
		// TODO Auto-generated method stub
		this.leilao.propoe(new Lance(usuario, valor));
		return this;
	}

	public Leilao constroi() {
		// TODO Auto-generated method stub
		return this.leilao;
	}

}
