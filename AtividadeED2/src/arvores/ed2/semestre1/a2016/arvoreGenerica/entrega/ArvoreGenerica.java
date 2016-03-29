package arvores.ed2.semestre1.a2016.arvoreGenerica.entrega;

public class ArvoreGenerica {
	private No raiz;

	public ArvoreGenerica(No raiz) {
		// this.raiz = null;
		this.raiz = raiz;
	}

	/*
	 * public No criarPai(Elemento elemento) { this.raiz = new No();
	 * raiz.setElemento(elemento); raiz.setPai(null); return raiz; }
	 */

	/*
	 * public boolean inserir(No p, No f) {
	 * 
	 * return false; }
	 */

	public No busca(String nome) {
		No no = this.raiz;
		if (no.getElemento().getNome() == nome){
			return no;
		}else{
              no=no.getListaDeFilho(nome);
		}
	}

	public boolean isRoot(No no) {
		return raiz.equals(no);
	}

	public No root() {
		return this.raiz;
	}

}
