package poo;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nome;
	private String matricula;
	private long id;
	private List<Professor> professores;
	

	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void adicionarProfessor(String matricula, String nome) {
		Professor professor = new Professor();
		professor.setNome(nome);
		professor.setMatricula(matricula);
		professores.add(professor);
		
	}
	
}
