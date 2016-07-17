package arvores.semestre1.a2016.arvoreAVL.entrega;

public class ArvoreAvl {
	private NoAvl raiz = null;

	public ArvoreAvl() {
		raiz = null;
	}

	public void clear() {
		raiz = null;
	}

	public boolean isEmpty() {
		return raiz == null;
	}

	public NoAvl getRootNode() {
		return raiz;
	}

	/** Retorna a altura da árvore */
	private static int height(NoAvl t) {
		return t == null ? -1 : t.getAltura();
	}

	/**
	 * Retorna o maior valor ente lhs e rhs.
	 */
	private static int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;
		/*
		 * operador ternário if(lhs > rhs) lhs else rhs
		 */
	}

	/** Retorna o fator de balanceamento da árvore com raiz t */
	private int getFactor(NoAvl t) {
		return height(t.esquerdo) - height(t.direito);
	}

	public boolean insert(int x) {
		raiz = insert(x, raiz);
		return true;
	}

	/**
	 * 
	 * @param x
	 * @param t
	 * @return NoAvl
	 */
	private NoAvl insert(int x, NoAvl t) {
		if (t == null)
			t = new NoAvl(x, null, null);
		else if (x < t.indice)
			t.esquerdo = insert(x, t.esquerdo);
		else if (x > t.indice)
			t.direito = insert(x, t.direito);
		t = balance(t);
		return t;
	}

	public NoAvl balance(NoAvl t) {
		if (getFactor(t) == 2) {
			if (getFactor(t.esquerdo) > 0)
				t = doRightRotation(t);
			else
				t = doDoubleRightRotation(t);
		} else if (getFactor(t) == -2) {
			if (getFactor(t.direito) < 0)
				t = doLeftRotation(t);
			else
				t = doDoubleLeftRotation(t);
		}
		t.altura = max(height(t.esquerdo), height(t.direito)) + 1;
		return t;
	}

	/** Faz Rotação simples a direita */
	private static NoAvl doRightRotation(NoAvl k2) {
		NoAvl k1 = k2.esquerdo;
		k2.esquerdo = k1.direito;
		k1.direito = k2;
		k2.altura = max(height(k2.esquerdo), height(k2.direito)) + 1;
		k1.altura = max(height(k1.esquerdo), k2.altura) + 1;
		return k1;
	}

	/** Rotação simples à esquerda */
	private static NoAvl doLeftRotation(NoAvl k1) {
		NoAvl k2 = k1.direito;
		k1.direito = k2.esquerdo;
		k2.esquerdo = k1;
		k1.altura = max(height(k1.esquerdo), height(k1.direito)) + 1;
		k2.altura = max(height(k2.direito), k1.altura) + 1;
		return k2;
	}

	/** Rotação dupla à direita */
	private static NoAvl doDoubleRightRotation(NoAvl k3) {
		k3.esquerdo = doLeftRotation(k3.esquerdo);
		return doRightRotation(k3);
	}

	/** Rotação dupla à esquerda */
	private static NoAvl doDoubleLeftRotation(NoAvl k1) {
		k1.direito = doRightRotation(k1.direito);
		return doLeftRotation(k1);
	}

	public NoAvl search(int el) {
		return search(raiz, el);
	}

	/**
	 * 
	 * @param p
	 * @param el
	 * @return NoAvl
	 */
	protected NoAvl search(NoAvl p, int el) {
		while (p != null) {
			/* se valor procuradp == chave do nó retorna referência ao nó */
			if (el == p.indice)
				return p;
			/*
			 * se valor procurado < chave do nó, procurar na sub-árvore esquerda
			 * deste nó
			 */
			else if (el < p.indice)
				p = p.esquerdo;
			/*
			 * se valor procurado > chave do nó, procurar na sub-árvore direita
			 * deste nó
			 */
			else
				p = p.direito;
		}
		// caso chave não foi achada, retorna null
		return null;
	}

	public void inorder() {
		inorder(raiz);
	}

	protected void inorder(NoAvl p) {
		if (p != null) {
			inorder(p.esquerdo);
			System.out.print(p.indice + " ");
			inorder(p.direito);
		}
	}

	public void preorder() {
		preorder(raiz);
	}

	protected void preorder(NoAvl p) {
		if (p != null) {
			System.out.print(p.indice + " ");
			preorder(p.esquerdo);
			preorder(p.direito);
		}
	}

	public void postorder() {
		postorder(raiz);
	}

	protected void postorder(NoAvl p) {
		if (p != null) {
			postorder(p.esquerdo);
			postorder(p.direito);
			System.out.print(p.indice + " ");
		}
	}

	/**
	 * 
	 * @param el
	 * @return NoAvl
	 */
	protected NoAvl searchFather(int el) {
		NoAvl p = raiz;
		NoAvl prev = null;
		while (p != null && !(p.indice == el)) { // acha o nó p com a chave el
			prev = p;
			if (p.indice < el)
				p = p.direito;
			else
				p = p.esquerdo;
		}
		if (p != null && p.indice == el)
			return prev;
		return null;
	}

	public void displayTree() {
		if (isEmpty()) {
			System.out.println("Árvore vazia!");
			return;
		}
		String separator = String.valueOf("  |__");
		System.out.println(this.raiz.indice + "(" + getFactor(raiz) + ")");
		displaySubTree(raiz.esquerdo, separator);
		displaySubTree(raiz.direito, separator);
	}

	/**
	 * 
	 * @param node
	 * @param separator
	 */
	private void displaySubTree(NoAvl node, String separator) {

		if (node != null) {

			NoAvl father = this.searchFather(node.indice);
			if (node.equals(father.esquerdo) == true) {
				System.out.println(separator + node.indice + "(" + getFactor(node) + ")" + " (ESQ)");
			} else {
				System.out.println(separator + node.indice + "(" + getFactor(node) + ")" + " (DIR)");
			}
			displaySubTree(node.esquerdo, "     " + separator);
			displaySubTree(node.direito, "     " + separator);
		}
	}

}