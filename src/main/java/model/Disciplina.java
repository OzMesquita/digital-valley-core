package model;

public class Disciplina {

	private int id;
	private Professor professor;
	private Curso curso;
	private String nome;

	public Disciplina() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		if (professor == null)
			throw new IllegalArgumentException("Erro: Professor inválido");
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		if (curso == null)
			throw new IllegalArgumentException("Erro: Curso inválido");
		this.curso = curso;
	}
}
