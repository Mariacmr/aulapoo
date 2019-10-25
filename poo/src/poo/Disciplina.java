package poo;


public class Disciplina {
	
	private long id;
	private long nome;
	private Turma turma;
	
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNome() {
		return nome;
	}
	public void setNome(long nome) {
		this.nome = nome;
	}	

}
