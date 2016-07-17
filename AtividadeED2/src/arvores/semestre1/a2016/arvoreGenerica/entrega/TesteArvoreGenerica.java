/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 * 
 */
package arvores.semestre1.a2016.arvoreGenerica.entrega;

import java.util.ArrayList;
import java.util.List;

public class TesteArvoreGenerica {
	public static void main(String[] args) {
		No noPai = new No();
		noPai.setPai(null);
		Elemento elementoPai = new Elemento("Jose");
		noPai.setElemento(elementoPai);

		No noFilhoMaria = new No();
		noFilhoMaria.setPai(noPai);
		Elemento elementoFilho = new Elemento("maria");
		noFilhoMaria.setElemento(elementoFilho);

		No noFilhoPedro = new No();
		noFilhoPedro.setPai(noPai);
		Elemento elementoFilho1 = new Elemento("pedro");
		noFilhoPedro.setElemento(elementoFilho1);

		No noFilhoLuiz = new No();
		noFilhoLuiz.setPai(noFilhoMaria);
		Elemento elementoFilho3 = new Elemento("luiz1");
		noFilhoLuiz.setElemento(elementoFilho3);

		noPai.setListaDeFilho(noFilhoMaria);
		noPai.setListaDeFilho(noFilhoPedro);
		noFilhoMaria.setListaDeFilho(noFilhoLuiz);

		ArvoreGenerica arvoreGenerica = new ArvoreGenerica(noPai);
		/*
		 * System.out.println(arvoreGenerica.isRoot(noPai));
		 * System.out.println(arvoreGenerica.isRoot(noFilhoMaria));
		 * System.out.println(noFilhoMaria.isInternal());
		 * System.out.println(noPai.isInternal());
		 * System.out.println(noPai.isExternal());
		 * System.out.println(noPai.iscrildren(noFilhoMaria));
		 * System.out.println(noFilhoMaria.iscrildren(noPai));
		 * System.out.println(arvoreGenerica.root().getElemento().getNome());
		 * System.out.println(arvoreGenerica.root().toString());
		 * System.out.println(No.size()); noFilhoMaria.parent();
		 * noFilhoPedro.parent(); noPai.crildren();
		 * System.out.println(arvoreGenerica.isEmpty());
		 * System.out.println(arvoreGenerica.profundidade(arvoreGenerica,
		 * noFilhoLuiz));
		 * 
		 */
		System.out.println(noPai.devolverFilho().get(1));
		System.out.println(arvoreGenerica.altura(arvoreGenerica, noFilhoMaria));
		System.out.println(arvoreGenerica.preOrder(noPai));

	}
}
