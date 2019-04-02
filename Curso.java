package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); //interface list

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public String getNome() {
		return nome;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) { // nao devolve nada
		this.aulas.add(aula);
	}

}
