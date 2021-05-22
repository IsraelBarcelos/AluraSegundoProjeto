package conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	/* Este será um conjunto ordenado por letras, como os objetos contidos serão numeros */
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	// A utilização de um arrayList ao inves de uma linkedlist como Objeto que contem a linkedList com os dados é mais performatica pelo motivo que o index é pegado do meio da lista 
	// para que saiba-se qual "coluna" da tabela a palavra pertence, já o motivo da lista ligada para as palavras, é que a facil alteração dessa lista ( inicio, fim, e alteração no meio sem shift )
	// é um meio muito mais performatico de se trabalhar.
	
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	public void adiciona(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		if(!contem(palavra, indice)) {
			
			List<String> lista = tabela.get(indice);
			lista.add(palavra);
		
		}
		
	}

	private boolean contem(String palavra, int indice) {
		return tabela.get(indice).contains(palavra);
	}

	private int calculaIndiceDaTabela(String palavra) {
		
		return palavra.toLowerCase().charAt(0) % 26;
	}
	
	
	public void remove(String palavra) {
		int indice = calculaIndiceDaTabela(palavra);
		if(contem(palavra, indice)) {
			List<String> lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}
		
	@Override
	public String toString() {
		return tabela.toString();
	}	
	
}
