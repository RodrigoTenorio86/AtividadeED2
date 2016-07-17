package arvores.semestre1.a2016.arvoreAVL.entrega.imcompleto;

public class NoAvl {
	private NoAvl direita;
	private NoAvl esquerda;
	private NoAvl pai;
	private int altura;
	private int key;
	private Elemento elemento;

	public Elemento getElemento() {
		return elemento;
	}

	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}

	public NoAvl getDireita() {
		return direita;
	}

	public void setDireita(NoAvl direita) {
		this.direita = direita;
	}

	public NoAvl getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(NoAvl esquerda) {
		this.esquerda = esquerda;
	}

	public NoAvl getPai() {
		return pai;
	}

	public void setPai(NoAvl pai) {
		this.pai = pai;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getElemento().toString();
	}
}
