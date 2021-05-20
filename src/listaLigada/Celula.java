package listaLigada;

public class Celula {
	private Object elemento;
	private Celula proxima;
	
	
	public Celula(Object elemento, Celula proxima) {
		super();
		this.elemento = elemento;
		this.proxima = proxima;
	}


	public Object getElemento() {
		return elemento;
	}


	public Celula getProxima() {
		return proxima;
	}


	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	
	
}
