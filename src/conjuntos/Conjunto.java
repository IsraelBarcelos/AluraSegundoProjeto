package conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	/* Este ser� um conjunto ordenado por letras, como os objetos contidos ser�o numeros */
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	// A utiliza��o de um arrayList ao inves de uma linkedlist como Objeto que contem a linkedList com os dados � mais performatica pelo motivo que o index � pegado do meio da lista 
	// para que saiba-se qual "coluna" da tabela a palavra pertence, j� o motivo da lista ligada para as palavras, � que a facil altera��o dessa lista ( inicio, fim, e altera��o no meio sem shift )
	// � um meio muito mais performatico de se trabalhar.
	
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
