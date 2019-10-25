package poo;

import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	private long matricula;
	private Turma turma;
	
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	Aluno(String nome, long matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
	}
	
	public ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	

}
