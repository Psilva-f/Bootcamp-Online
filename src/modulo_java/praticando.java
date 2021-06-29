package modulo_1;

import java.math.*;
public class praticando {

	public static void main(String[] args) {
		double nota1, nota2, nota3, notaTrabalho1, notaTrabalho2, notaTrabalho3, frequencia, notasProvas, notastrabalhos;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Maria de Souza Santos";
		nota1 = 10;
		nota2 = 7;
		nota3 = 5;
		
		notaTrabalho1 = 10;
		notaTrabalho2 = 20;
		notaTrabalho3 = 20;
		
		
		frequencia = 0.90;
		
		notasProvas = nota1 + nota2 + nota3;
		notastrabalhos = notaTrabalho1 + notaTrabalho2 + notaTrabalho3;
		
		aprovado = notasProvas >= 70 || notastrabalhos >= 100 && frequencia >= 0.75;
				
		System.out.printf("O(a) aluno(a) %s obteve nota final nas provas de %.0f e obteve nota final dos trabalhos de %.0f e "
				+ "frequencia %.0f%%. \nAluno aprovado? %b", nomeAluno, notasProvas, notastrabalhos, frequencia*100,aprovado);
				
	}

}
