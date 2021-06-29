package modulo_1;

import java.util.*;
import javax.swing.JOptionPane;

public class IMCscanner {

	private static char[] s;

	public static void main(String[] args) {
		String feminino;
		String masculino;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Informe seu sexo:Feminino ou masculino, Para feminino digite[1]\n Para masculino digite[2]\n");
		
		int sexo = Integer.parseInt(input.next());
		
		if(sexo ==1) {
			System.out.println("O seu sexo é feminino!");
		}
		else if(sexo==2);
		{
		System.out.println("Seu sexo é: Masculino!");
		}
		System.out.print(s);
	
}
}
