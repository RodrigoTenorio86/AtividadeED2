package arvores.semestre1.a2016.arvoreAVL.entrega.imcompleto;

public class ArvoreAvl {
	private NoAvl raiz = null;

	/**
	 * 
	 */
	public ArvoreAvl() {
		this.raiz = null;
	}

	/**
	 * 
	 * @param raiz
	 */
	public ArvoreAvl(NoAvl raiz) {
		this.raiz = raiz;
	}

	public void clear() {
		this.raiz = null;
	}

	public void remover(NoAvl n) {
		n = null;
	}

	public boolean isEmpty() {
		return this.raiz == null;
	}

	public NoAvl getRaiz() {
		return raiz;
	}

	public boolean isRoot(NoAvl n) {
		return this.raiz.equals(n);// this.raiz==n;
	}

	public NoAvl left(NoAvl n) {
		return n.getEsquerda();
	}

	public NoAvl right(NoAvl n) {
		return n.getDireita();
	}

	public boolean hasLeft(NoAvl n) {
		return n.getEsquerda() != null;
	}

	public boolean hasRight(NoAvl n) {
		return n.getDireita() != null;
	}

	public void addRoot() {

	}

	public void insertLeft(NoAvl pai, NoAvl fE) {
		pai.setEsquerda(fE);
	}

	public void insertRight(NoAvl pai, NoAvl fD) {
		pai.setDireita(fD);
	}
}
