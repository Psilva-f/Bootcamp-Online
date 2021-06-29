package modulo_1;

import java.math.*;

public class aula2_13 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Ana Paula de Souza";
		statusAluno = 'M'; 
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 30;
		nota4 = 5;
		
		frequencia = 0.60;
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
				+ "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);

		
	}

}
