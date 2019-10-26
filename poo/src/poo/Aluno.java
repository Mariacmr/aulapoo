package poo;

import java.util.List;

public class Aluno {
	
	private String nome;
	private String matricula;
	private Turma turma;
	public List<Aluno> alunos;
	
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	Aluno(String nome, String matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void adicionarAluno(String matricula, String nome) {
		Aluno aluno = new Aluno(nome, matricula);
		alunos.add(aluno);
	}
	

}
