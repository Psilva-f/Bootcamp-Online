package modulo_1;

public class aula2_6 {

	public static void main(String[] args) {
		String nome, nome2;
		nome = "José Santos Souza";
		nome2 = "Marian Rocha de Souza";
		
		System.out.println("Nome: " + nome);
		System.out.println("Nome: " + nome2);
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		System.out.println("A variável nome tem " + tamanhoDoNome + " caracteres.");
		System.out.println("A variável nome tem " + tamanhoDoNome2 + " caracteres.");
		
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas variáveis é: " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a', '9');
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(6, 12);
		System.out.println(somenteNome);
		
		String nomeTudoMaiusculo = nome2.toUpperCase();
		System.out.println(nomeTudoMaiusculo);
		
		String nomeTudoMinusculo = nome.toLowerCase();
		System.out.println(nomeTudoMinusculo);
		
		//Principais metodos prontos da classe String
		//Manipulando Strings
	}

}
