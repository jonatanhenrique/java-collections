/**
 * @author Jonatan
 *
 * HashSet - Rápido (mais velocidade do que linked ou array list)
 * Nao possui o método get (este método tem apenas em List)
 */

package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			
		}
		
		System.out.println(alunos.size());
		
	
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos); // encapsulando a collection set na collection LIST
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
		
		
		
	}

}
