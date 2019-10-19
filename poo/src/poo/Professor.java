package poo;

import java.util.ArrayList;

public class Professor {
	
	private String nome;
	
	private ArrayList<Turma> turma = new ArrayList<Turma>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Turma> getTurma() {
		return turma;
	}

	public void setTurma(ArrayList<Turma> turma) {
		this.turma = turma;
	}
	
	
}
