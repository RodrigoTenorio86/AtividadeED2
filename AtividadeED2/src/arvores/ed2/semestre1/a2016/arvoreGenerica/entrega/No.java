/**
 * @author RodrigoTenorio
 * 
 */
package arvores.ed2.semestre1.a2016.arvoreGenerica.entrega;

import java.util.HashMap;
import java.util.Map;

public class No {
	private Elemento elemento;
	private No pai;
	private Map<String, No> listaDeFilho;
	private static int totalDeNo;

	public No() {
		this.listaDeFilho = new HashMap<String, No>();
		No.totalDeNo++;
	}

	public No getListaDeFilho(String key) {
		return this.listaDeFilho.get(key);
	}

	public void setListaDeFilho(No value) {
		String key = (String) value.getElemento().getNome();
		this.listaDeFilho.put(key, value);

	}

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}

	public Elemento elemento(No no) {
		return no.getElemento();
	}

	public boolean isInternal() {
		return this.listaDeFilho.size() != 0;
	}

	public boolean isExternal() {
		return this.listaDeFilho.size() == 0;
	}

	public String crildren(No v) {
		String nome = null;
		return nome;
	}

	public boolean iscrildren(No f) {
		return f.getPai() == this;
	}

	public static int size(){
		return No.totalDeNo;
	}
}
