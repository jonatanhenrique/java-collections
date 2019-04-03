package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as collections", "Jonatan");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando colecctions", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17465);
		Aluno a4 = new Aluno("Paulo S", 5617);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println("QUem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5618);
		System.out.println("Aluno: " + aluno);
		
		Map<Integer, Set<Aluno>> matriculaParaAlunos;

	}

}
