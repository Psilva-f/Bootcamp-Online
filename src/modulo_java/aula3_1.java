package modulo_1;

import java.math.*;
import java.util.Scanner;

public class aula3_1 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
				
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaractere.nextLine();
		
		System.out.printf("Digite um caracter para a situação do aluno (O --> OK; P --> Pendência: ");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.printf("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.printf("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.printf("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.printf("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.print("Digite a frequência do aluno: ");
		frequencia = entradaNotas.nextDouble();
				
		totalNotas = nota1 + nota2 + nota3 + nota4;
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) Aluno(a) %s obteve nota final %.2f e frequencia %.2f%"
				+ "%. A situação do(a) aluno(a) é %c\n"
				+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
				
	}

}
