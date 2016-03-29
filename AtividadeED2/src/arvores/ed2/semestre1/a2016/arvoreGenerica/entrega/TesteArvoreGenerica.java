package arvores.ed2.semestre1.a2016.arvoreGenerica.entrega;

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

		noPai.setListaDeFilho(noFilhoMaria);
		noPai.setListaDeFilho(noFilhoPedro);
		
		ArvoreGenerica arvoreGenerica = new ArvoreGenerica(noPai);
		
		System.out.println(arvoreGenerica.isRoot(noPai));
		System.out.println(arvoreGenerica.isRoot(noFilhoMaria));
		System.out.println(noFilhoMaria.isInternal());
		System.out.println(noPai.isInternal());
		System.out.println(noPai.isExternal());
		System.out.println(noPai.iscrildren(noFilhoMaria));
		System.out.println(noFilhoMaria.iscrildren(noPai));
		System.out.println(arvoreGenerica.root().getElemento().getNome());
		System.out.println(No.size());
	}
}
