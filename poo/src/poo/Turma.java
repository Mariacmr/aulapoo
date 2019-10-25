package poo;


import java.util.List;

public class Turma {

	private long cod;
	private Disciplina disciplina;
	private List<Professor> professores;
	private List<Aluno> alunos;
	

	public long getCod() {
		return cod;
	}
	public void setCod(long cod) {
		this.cod = cod;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
}
