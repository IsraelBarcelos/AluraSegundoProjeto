package pilha;

public class TesteDaPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha pilha = new Pilha();
		
		pilha.insere("texto1");
		System.out.println(pilha);
		pilha.insere("texto2");
		System.out.println(pilha);

		System.out.println(pilha.remove());
		System.out.println(pilha.remove());
	}

}
