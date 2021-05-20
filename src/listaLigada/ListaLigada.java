package listaLigada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		
		this.totalDeElementos++;
		
	}
	
	public void adiciona(Object elemento) {
		
		if(this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else { 
			Celula nova = new Celula(elemento, ultima);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			
			this.totalDeElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		Celula atual = this.primeira;
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		
		return atual;
	}
	
	public void adiciona(int posicao, Object elemento) {
		
		if(this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else if(posicao == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
		
			Celula anterior = this.pegaCelula(posicao-1);
			Celula nova = new Celula(elemento, anterior.getProxima());
			anterior.setProxima(nova);
			this.totalDeElementos++;
		}
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista está vazia!");
		}
		
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--; 
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public boolean contem(Object o) {
		Celula nova = this.pegaCelula(0);
		for (int i = 0; i < this.totalDeElementos; i++) {
			if(!o.equals(nova.getElemento())) {
				nova = nova.getProxima();
			}else {
				return true;
			}			
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < totalDeElementos; i++) {
			
			builder.append(atual.getElemento() + ", ");
			
			atual = atual.getProxima();
			
		}
		
		builder.append("]");
		
		return builder.toString();
	}
	
	
}
