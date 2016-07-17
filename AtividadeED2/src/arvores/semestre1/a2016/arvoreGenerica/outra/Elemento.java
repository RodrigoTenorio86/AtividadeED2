package arvores.semestre1.a2016.arvoreGenerica.outra;

public class Elemento {
	private Object nome;

	public Elemento(Object nome) {
		this.nome = nome;
	}

	public Object getNome() {
		return this.nome;
	}

	public void setNome(Object nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (String) this.nome;
	}
}
