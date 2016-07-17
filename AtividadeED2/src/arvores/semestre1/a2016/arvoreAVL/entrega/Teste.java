package arvores.semestre1.a2016.arvoreAVL.entrega;

class Teste {
	public static void main(String args[]) {
		ArvoreAvl t = new ArvoreAvl();
		t.insert(10);
		t.insert(20);
		t.insert(30);
		t.insert(40);
		t.insert(50);
		t.insert(60);
		t.insert(70);
		t.insert(80);
		t.insert(90);
		t.insert(95);
		System.out.println("\n\nArvore Completa:");
		t.displayTree();
		System.out.println("\nInOrder: ");
		t.inorder();
		System.out.println("\nPreOrder: ");
		t.preorder();
		System.out.println("\nPosOrder:");
		t.postorder();

	}
}