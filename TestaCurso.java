package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as collections", "Jonatan");
	
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando colecctions", 22));

		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(javaColecoes.getAulas());
		
		
	}

}
