package pilha;

import java.util.LinkedList;

public class Pilha {
	
	private LinkedList<String> nomes = new LinkedList<String>();
	
	public void insere(String nome) {
		nomes.add(nome);
	}
	
	public String remove() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazia() {
		return nomes.size() == 0;
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
}
