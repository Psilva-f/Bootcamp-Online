package modulo_1;

public class aula_1 {

	public static void main(String[] args) {
		
		int idade = 30;
		double altura = 1.80;
		String nome = "José Santos Souza";
		boolean estudante = true;
		char sexo = 'M';
		
		/*Java define 4 tipos de inteiros:byte, short, int e long
		 
		 tipo		tamanho em bits			intervalo
		 byte				8					-128 a 127
		 short				16				-32.768 a 32.767
		 int				32				-2.147.483.648 a 2.147.483.647
		 long				64				-3.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		 */
			
				
		/*System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		*/
		/* 
		 * curinga
		 %s = String
		 %d = Int
		 %.2f ou 4f =float ou double com duas casas decimais
		 %b = boolean
		 %c = caractere (char)
		 */
				
		 /*resultado = (var1 == var2);
		System.out.printf("As variaveis são iguais? \nResposta: %b", resultado);
		*/
				
		/*resultado = (var1 != var2);
		System.out.printf("As variaveis são iguais? \nResposta: %b", resultado);
		*/
		/*resultado = (var1 < var2);
		System.out.printf("As variaveis são iguais? \nResposta: %b", resultado);
		*/

				
		System.out.printf("Idade %d e a Altura é %.2f, nome %s. \nÉ estudante? %b. \nSexo: %c", idade, altura, nome, estudante, sexo);


	}

}
