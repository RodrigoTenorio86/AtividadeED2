/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 * 
 */
package arvores.semestre1.a2016.arvoreBinaria.entrega;

import java.util.ArrayList;
import java.util.List;

public class ArvoreBinaria {
	private No root;
	private int resul;
	private List<Object> arrayPosFixa;

	public ArvoreBinaria() {
		this.root = null;
	}

	public ArvoreBinaria(No v) {
		this.root = v;
		this.arrayPosFixa = new ArrayList<Object>();
		this.resul = 0;
	}

	public No getRoot() {
		return this.root;
	}

	public boolean isRoot(No v) {
		return this.root == v;
		// return this.root.equals(v);
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public void remove(No v) {
		v = null;
	}

	public void insertLeft(No pai, No fe) {
		pai.setNoFe(fe);
	}

	public void insertRight(No pai, No fr) {
		pai.setNoFd(fr);
	}

	public void addRoot(No v) {
		this.root = v;
	}

	public int chave(No v) {
		return v.getChave();
	}

	public No esq(No v) {
		return v.getNoFe();
	}

	public No dir(No v) {
		return v.getNoFd();
	}

	public No busca(int k, No v) {
		if (k < chave(v)) {
			return busca(k, esq(v));
		} else if (k > chave(v)) {
			return busca(k, dir(v));
		} else
			return v;
	}

	public void preOrder(No n) {
		if (n != null) {
			System.out.print(n.toString());
			preOrder(n.getNoFe());
			preOrder(n.getNoFd());
		}
	}

	public void posOrder(No n) {
		if (n != null) {
			posOrder(n.getNoFe());
			posOrder(n.getNoFd());
			System.out.print(n.toString());
			pilhaPosFixa(n.toString());
		}
	}

	public void inOrder(No n) {
		if (n != null) {
			inOrder(n.getNoFe());
			System.out.print(n.toString());
			inOrder(n.getNoFd());
		}
	}

	private void pilhaPosFixa(Object n) {
		this.arrayPosFixa.add(n);
	}

	private void organizarArrays(int resul, int index) {
		int inicio = 0, remover = 0;
		remover = index - 2;
		while (inicio < 3) {
			this.arrayPosFixa.remove(remover);
			inicio++;
		}
		this.arrayPosFixa.add(remover, resul);
	}

	public int operacaoPosFixa() {
		int cont = 0;
		while ((cont < this.arrayPosFixa.size())) {
			switch (this.arrayPosFixa.get(cont).toString()) {
			case "*":
				this.resul = Integer.parseInt(this.arrayPosFixa.get(cont - 2).toString())
						* Integer.parseInt(this.arrayPosFixa.get(cont - 1).toString());
				this.organizarArrays(resul, cont);
				cont = -1;
				break;
			case "+":
				this.resul = Integer.parseInt(this.arrayPosFixa.get(cont - 2).toString())
						+ Integer.parseInt(this.arrayPosFixa.get(cont - 1).toString());
				this.organizarArrays(resul, cont);
				cont = -1;
				break;
			case "/":
				this.resul = Integer.parseInt(this.arrayPosFixa.get(cont - 2).toString())
						/ Integer.parseInt(this.arrayPosFixa.get(cont - 1).toString());
				this.organizarArrays(resul, cont);
				cont = -1;
				break;
			case "-":
				this.resul = Integer.parseInt(this.arrayPosFixa.get(cont - 2).toString())
						- Integer.parseInt(this.arrayPosFixa.get(cont - 1).toString());
				this.organizarArrays(resul, cont);
				cont = -1;
				break;
			// default:
			// break;
			}
			cont++;
		}
		return Integer.parseInt(this.arrayPosFixa.get(0).toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
