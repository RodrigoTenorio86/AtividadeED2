/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 * 
 */
package arvores.semestre1.a2016.arvoreBinaria.entrega;

public class No {
	private No noPai;
	private No noFd;
	private No noFe;
	private Elemento elemento;
	private int chave;

	public No() {

	}

	public No(No noPai, No noFd, No noFe, int chave, Elemento elemento) {
		this.noPai = noPai;
		this.noFd = noFd;
		this.noFe = noFe;
		this.chave = chave;
		this.elemento = elemento;
	}

	public No(No noPai, No noFd, No noFe, int chave) {
		this.noPai = noPai;
		this.noFd = noFd;
		this.noFe = noFe;
		this.chave = chave;
	}

	public No(No noFd, No noFe, Elemento elemento, int chave) {
		this.noFd = noFd;
		this.noFe = noFe;
		this.elemento = elemento;
		this.chave = chave;
	}

	public No(No noPai, int chave) {
		this.noPai = noPai;
		this.chave = chave;
	}

	public No(Elemento elemento, int chave) {
		this.elemento = elemento;
		this.chave = chave;
	}

	public No(No noPai, No noFd, No noFe) {
		this.noPai = noPai;
		this.noFd = noFd;
		this.noFe = noFe;

	}

	public No(Elemento elemento) {
		this.elemento = elemento;

	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public No left() {
		return this.noFe;
	}

	public No right() {
		return this.noFd;
	}

	public boolean hasLeft() {
		return this.noFe == null;
	}

	public boolean hasRight() {
		return this.noFd == null;
	}

	public No getNoPai() {
		return this.noPai;
	}

	public void setNoPai(No noPai) {
		this.noPai = noPai;
	}

	public No getNoFd() {
		return this.noFd;
	}

	public void setNoFd(No noFd) {
		this.noFd = noFd;
	}

	public No getNoFe() {
		return this.noFe;
	}

	public void setNoFe(No noFe) {
		this.noFe = noFe;
	}

	public Elemento getElemento() {
		return this.elemento;
	}

	public boolean isInternal() {
		return this.noPai.noFd == null && this.noPai.noFe == null;
	}

	public boolean isExternal() {
		return this.noPai.noFd != null && this.noPai.noFe != null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();
		return this.elemento.toString();
	}
}
