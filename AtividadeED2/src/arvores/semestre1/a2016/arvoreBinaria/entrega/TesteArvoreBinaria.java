/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 * 
 */
package arvores.semestre1.a2016.arvoreBinaria.entrega;

import java.util.List;

public class TesteArvoreBinaria {
	public static void main(String[] args) {
		Elemento e1 = new Elemento("+");
		No raiz = new No(e1, 1);

		Elemento e2 = new Elemento("*");
		No n1 = new No(e2);

		Elemento e3 = new Elemento("2");
		No n2 = new No(e3);

		Elemento e4 = new Elemento("3");
		No n3 = new No(e4);

		Elemento e5 = new Elemento("/");
		No n4 = new No(e5);

		Elemento e6 = new Elemento("400");
		No n5 = new No(e6);

		Elemento e7 = new Elemento("*");
		No n6 = new No(e7);

		Elemento e8 = new Elemento("+");
		No n7 = new No(e8);

		Elemento e9 = new Elemento("5");
		No n8 = new No(e9);

		Elemento e10 = new Elemento("3");
		No n9 = new No(e10);

		Elemento e11 = new Elemento("5");
		No n10 = new No(e11);

		ArvoreBinaria tree = new ArvoreBinaria(raiz);

		tree.insertLeft(raiz, n1);
		tree.insertRight(raiz, n4);

		tree.insertLeft(n1, n2);
		tree.insertRight(n1, n3);

		tree.insertLeft(n4, n5);
		tree.insertRight(n4, n6);

		tree.insertLeft(n6, n7);
		tree.insertRight(n6, n10);

		tree.insertRight(n7, n9);
		tree.insertLeft(n7, n8);

		System.out.print("PreOrder: ");
		tree.preOrder(raiz);
		System.out.println();
		System.out.print("PosOrder: ");
		tree.posOrder(raiz);
		System.out.println();
		System.out.print("INOrder: ");
		tree.inOrder(raiz);
		System.out.println();
		// System.out.println("RESUltado: "+tree.operacaoPosFixa());

		Calculadora c = new Calculadora(raiz);
		c.posOrder(raiz);
		System.out.println("RESUltado: " + c.operacaoPosFixa());

	}
}
