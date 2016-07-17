package arvores.semestre1.a2016.arvoreGenerica.outra;

public class No {
	private Elemento elemento;
	private No noPai;
	private No ListadeFilhos;
	private static int qtdNo;

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public No getNoPai() {
		return noPai;
	}

	public void setNoPai(No noPai) {
		this.noPai = noPai;
	}

	public No getListadeFilhos() {
		return ListadeFilhos;
	}

	public void setListadeFilhos(No listadeFilhos) {
		ListadeFilhos = listadeFilhos;
	}

}
