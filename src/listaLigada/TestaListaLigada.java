package listaLigada;

public class TestaListaLigada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("mauricio");
		lista.adicionaNoComeco("paulo");
		lista.adicionaNoComeco("guilherme");
		
		System.out.println(lista);
		
		lista.adiciona("alguem");
		System.out.println(lista);
		
		lista.adiciona(2,"Gabs");
		System.out.println(lista);
		
		System.out.println(lista.contem("jose"));
	}

}
