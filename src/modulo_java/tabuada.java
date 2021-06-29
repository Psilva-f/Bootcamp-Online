package modulo_1;

import java.io.IOException;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		int number;
		int tabuada;
			
		number = 10;
		tabuada = 0;
		
		for (int i = 1; i < 11; i++){
			 tabuada = number *i;
			 System.out.println("A tabuada do 10 * " + i +" = " + tabuada);
		}
		
		

	}

}
