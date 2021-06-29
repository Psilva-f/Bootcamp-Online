package modulo_1;

import java.io.IOException;
import java.util.Scanner;

public class tabuada_60 {

	public static void main(String[] args) {
		int number;
		int tabuada;
		
		number = 60;
		tabuada = 0;
		
		for(int i = 1; i < 10; i++) {
			tabuada = number /i;
			System.out.println("60 / "+ i +" = " + tabuada);
		}
		

		
	}

}
