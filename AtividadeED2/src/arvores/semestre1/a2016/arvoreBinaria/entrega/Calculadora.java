package arvores.semestre1.a2016.arvoreBinaria.entrega;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	ArvoreBinaria ab = null;
	private int resul;
	private List<Object> arrayPosFixa;

	public Calculadora() {

	}

	public Calculadora(No n) {
		this.ab = new ArvoreBinaria(n);
		this.arrayPosFixa = new ArrayList<Object>();
		this.resul = 0;
	}
	
	public void posOrder(No n) {
		if (n != null) {
			posOrder(n.getNoFe());
			posOrder(n.getNoFd());
			//System.out.print(n.toString());
			pilhaPosFixa(n.toString());
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

}
