package modulo_1;

import java.math.*;

public class aula2_11 {

	public static void main(String[] args) {
		boolean ultimo_3_EmprestimosQuitadosNoPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		ultimo_3_EmprestimosQuitadosNoPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstrelas = true;
		restricaoCredito = false;
		
		boolean concederEmprestimo = (ultimo_3_EmprestimosQuitadosNoPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		System.out.printf("Emprestimo concedido? \n%b", concederEmprestimo);
		
		//aplicação de operadores logicos
	}

}
