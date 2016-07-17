package arvores.semestre1.a2016.arvoreAVL.entrega;
/**
 * @author RodrigoTenorio ra00052957
 * @author LuizMartins  ra00051479
 * @author Paloma ou Paola ou paula????
 */
public class NoAvl {
    Elemento elemento; 
    int indice;
    int altura;
    NoAvl pai;
    NoAvl esquerdo; 
    NoAvl direito;
    /**
     * Construtor
     * @param chave 
     */
    public NoAvl ( int chave ) {
        this( chave, null, null );
    }
/**
 * 
 * @param key
 * @param lt
 * @param rt
 */
    public NoAvl ( int key, NoAvl lt, NoAvl rt ) {
    	this.indice = key;
    	this.esquerdo = lt;
    	this.direito = rt;
    	this.elemento   = null;
    }
/**
 * 
 * @param indice
 * @param esquerda
 * @param direita
 * @param elemento
 */
    public NoAvl ( int indice, NoAvl esquerda, NoAvl direita, Elemento elemento) {
    	this.indice = indice;
        this.esquerdo = esquerda;
        this.direito = direita;
        this.elemento   = elemento;
    }

/**
 * 
 * @return elemento
 */
	public Elemento getElemento() {
		return elemento;
	}

/**
 * 
 * @param elemento
 */
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}


	public int getIndice() {
		return indice;
	}


	public void setIndice(int chave) {
		this.indice = chave;
	}


	public NoAvl getEsquerda() {
		return esquerdo;
	}


	public void setEsquerda(NoAvl esquerda) {
		this.esquerdo = esquerda;
	}

	public NoAvl getDireita() {
		return direito;
	}

	public void setDireita(NoAvl Direita) {
		this.direito = Direita;
	}
/**
 * 
 * @return altura
 */
	public int getAltura() {
		return altura;
	}
/**
 * 
 * @param altura
 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
