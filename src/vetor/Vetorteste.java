package vetor;

import alunos.Aluno;

public class Vetorteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno("joao");
		Aluno a2 = new Aluno("maria");
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		Aluno a3 = new Aluno("josefilho");
		
		System.out.println(lista.contem(a3));
	}

}
