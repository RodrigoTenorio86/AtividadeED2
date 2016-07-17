/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 * 
 */
package arvores.semestre1.a2016.arvoreGenerica.entrega;

public class ArvoreGenerica {
	private No raiz = null;

	public ArvoreGenerica(No raiz) {
		// this.raiz = null;
		this.raiz = raiz;
	}

	public ArvoreGenerica() {
		this.raiz = null;
	}

	public boolean isRoot(No no) {
		return raiz.equals(no);
	}

	public No root() {
		return this.raiz;
	}

	public boolean isEmpty() {
		return this.raiz == null;
	}

	public void inserir(No p, No f) {
		p.setListaDeFilho(f);
		f.setPai(p);
	}

	public int profundidade(ArvoreGenerica t, No no) {
		if (t.isRoot(no)) {
			return 0;
		} else {
			return 1 + profundidade(t, no.getPai());
		}
	}

	public int altura(ArvoreGenerica t, No no) {
		if (no.isExternal()) {
			return 0;
		} else {
			int h = 0;
			for (int i = 0; i < no.devolverFilho().size(); i++) {
				h = Math.max(h, altura(t, no.devolverFilho().get(i)));
			}
			return 1 + h;
		}
	}

	public String preOrder(No n) {
		String s;
		s = (String) n.getElemento().getNome();
		if (n.isInternal()) {
			boolean primeiraVez = true;
			for (int i = 0; i < n.devolverFilho().size(); i++) {
				if (primeiraVez) {
					s = s + "(" + preOrder(n.devolverFilho().get(i));
					primeiraVez = false;
				} else {
					s = s + "," + preOrder(n.devolverFilho().get(i));
				}
			}
			s = s + ")";
		}
		return s;
	}

	public int posOrder(No n) {
		int tam;
		tam = (int) n.elemento(n).getNome();
		for (int i = 0; i < n.devolverFilho().size(); i++) {
			tam = tam + posOrder(n.devolverFilho().get(i));
		}
		if (n.isInternal()) {

		}
		return tam;
	}

}
