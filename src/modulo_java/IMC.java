package modulo_1;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		String nome;
		double altura;
		char sexo;
		double  peso;
		double resultadoIMC;
		
		nome = "Daniel Oliveira";
		sexo = 'M';
		altura = 1.87;
		peso = 107;
		resultadoIMC = ((peso) / (altura * altura));
		
		System.out.printf("Nome: %s \nSexo: %c", nome, sexo);
		
		if (resultadoIMC >=30)
		{
			System.out.println("\nVocê está com Obesidade");
		}
		else if (resultadoIMC >25 && resultadoIMC <29.9)
		{
			System.out.println("Acima do peso");
		}
		else if (resultadoIMC >18.5 && resultadoIMC <24.9)
		{
			System.out.println("Peso normal");
		}
		else {
			 
	    	System.out.println("Abaixo do peso normal");
		}
	
		}
	}