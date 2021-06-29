package modulo_1;

import java.math.*;

public class cartaoVisitas {

	public static void main(String[] args) {
		String areaAtuacao;
		String nome;
		String Sobrenome;
		int telefone;
		String endereco;
		int numero;
		int sala;
		String bairro;
		String cidade;
		
		
		nome = "Daniel";
		Sobrenome = "Oliveira";
		areaAtuacao = "Desenvolvimento de Software";
		telefone = 999711000;
		endereco = "Rua Amazonas";
		numero = 1970;
		sala = 103;
		bairro = "Cidade Jardim";
		cidade = "São Paulo";
	
		
		System.out.printf("Nome: %s %s \nÁrea de atuação: %s \nTelefone: %d \nEndereço: %s, %d sala: %d \nBairro: %s \nCidade: %s", nome, Sobrenome, areaAtuacao, telefone, endereco, numero, sala, bairro, cidade);
		
				
				/*
		 		 %s = String
				 %d = Int
				 %.2f ou 4f =float ou double com duas casas decimais
				 %b = boolean
				 %c = caractere (char)
				 */
		

	}

}
