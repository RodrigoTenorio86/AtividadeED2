package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances;

	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}

	public void propoe(Lance lance) {
		if (lances.isEmpty() || podeDaLance(lance.getUsuario())) {
			lances.add(lance);
		}
	}

	private boolean podeDaLance(Usuario usuario) {
		return !ultimoLanceDado().getUsuario().equals(usuario) && qtdLanceDo(usuario) < 5;
	}

	private int qtdLanceDo(Usuario usuario) {
		int total = 0;
		for (Lance l : lances) {
			if (l.getUsuario().equals(usuario))	total++;
		}
		return total;
	}

	private Lance ultimoLanceDado() {
		return lances.get(lances.size() - 1);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

}
