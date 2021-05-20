package vetor;

import java.util.Arrays;
import alunos.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	
	private void garanteEspaco() {
		if(totalDeAlunos == alunos.length ) {
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			for(int i=0;i<alunos.length;i++) {
				novoArray[i] = alunos[i];
			}
			
			this.alunos = novoArray;
		}
	}
	
	
	
	public void adiciona(Aluno aluno) {
		
		this.garanteEspaco();
		
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	private boolean validaPosicao(int posicao) {
		return posicao >= 0  && posicao <= totalDeAlunos;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		
		this.garanteEspaco();
		
		if(!validaPosicao(posicao)) {
			throw new IllegalArgumentException("Posicção inválida!");
		}
		
		
		for (int i = totalDeAlunos; i >= posicao  -1; i--) {
			alunos[i+1] = alunos[i];
		}
		
		totalDeAlunos++;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao <= 100 && posicao >= 0;
	}

	public Aluno pega(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return alunos[posicao];
	}
	
	

	public void remove(int posicao) {
		for(int i = posicao; i < totalDeAlunos; i++) {
			 this.alunos[i] = this.alunos[i+1];
		}
		
		totalDeAlunos--;
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if(alunos[i].equals(aluno)) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
