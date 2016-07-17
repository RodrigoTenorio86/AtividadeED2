/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 * 
 */
package arvores.semestre1.a2016.arvoreGenerica.entrega;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	public Map getListaDeFilho() {
		return this.listaDeFilho;
	}

	public void setListaDeFilho(No value) {
		String key = (String) (value.getElemento()).getNome();
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
		return  no.getElemento();
	}

	public boolean isInternal() {
		return this.listaDeFilho.size() != 0;
	}

	public boolean isExternal() {
		return this.listaDeFilho.size() == 0;
	}

	public static int size() {
		return No.totalDeNo;
	}

	public void crildren() {
		for (String key : this.listaDeFilho.keySet()) {
			No nomes = this.listaDeFilho.get(key);
			System.out.println(nomes.toString());
		}
	}

	public List<No> devolverFilho() {
		List<No> listaFilho=new ArrayList<No>(this.listaDeFilho.values());
		//List<No> listaFilho=new ArrayList<No>(this.listaDeFilho.keySet());
		return listaFilho;
	}

	public boolean iscrildren(No f) {
		return f.getPai() == this;
	}

	public void parent() {
		System.out.println(this.getPai().toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (String) this.elemento.getNome();
	}
}
