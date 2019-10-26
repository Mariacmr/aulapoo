package poo;

import java.util.List;

public class Disciplina {
	
	private long id;
	private String nome;
	private Turma turma;
	private List <Disciplina> disciplinas;
	
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public void adicionarDisciplina(String nome) {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		disciplinas.add(disciplina);
	}

}
