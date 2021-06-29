package modulo_1;

public class aula2_10 {

	public static void main(String[] args) {
	/*Operador		Significado
		 * ==				igual a
		 * !=				diferente de
		 * >				maior que
		 * < 				menor que
		 * >=				maior igual a	
		 * <=				menor igual a
		 * */
		
		/*int var1 = 300, var2 = 100;
				boolean resultado;
		
		
		resultado = (var1 > var2);
		System.out.printf("As variaveis são iguais? \nResposta: %b", resultado);
*/
		/*precedência
		 * &&	and(E)
		 * ||	or(OU)
		 * !    not(NÃO)
		 */
		
		boolean p, q, s;
		p = false; q = false;
		s = p && q ; 
		System.out.printf("p: %b; q: %b: s: %b\n", p, q, s);
		
		p = true; q = false;
		s = p && q ; 
		System.out.printf("p: %b; q: %b: s: %b\n", p, q, s);
		
		p = false; q = true;
		s = p && q ; 
		System.out.printf("p: %b; q: %b: s: %b\n", p, q, s);
		
		p = true; q = true;
		s = p && q ; 
		System.out.printf("p: %b; q: %b: s: %b\n", p, q, s);
	}

}
