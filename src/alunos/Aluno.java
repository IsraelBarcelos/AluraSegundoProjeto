package alunos;

public class Aluno {
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.getNome());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
