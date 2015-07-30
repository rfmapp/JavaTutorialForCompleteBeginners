package coreJava;

/**
 * Arrays de Strings.
 * @author rafael
 *
 */

public class App11ArrayOfStrings {
	
	public static void main(String[] args) {
		
		// Essa é uma outra maneira de declarar arrays.
		String[] animais = {"gato", "cachorro", "macaco", "cobra"};
		
		// Podemos saber o tamanho de um array (quantidade de elementos).
		System.out.println(animais.length);
		
		// Podemos obter um determinado elemento especificando a sua posição (índice) no array.
		System.out.println(animais[0]);
		
		// Podemos também iniciar um loop para exibir todos os elementos.
		// No exemplo abaixo, podemos dizer que o trecho diz "para cada animal dentro da coleção animais, imprima o nome do animal".
		for (String animal : animais){
			System.out.println(animal);
		}
		
		// Temos ainda a maneira "tradicional" de se fazer esse loop.
		for (int i = 0; i < animais.length; i++){
			System.out.println(animais[i]);
		}
	}

}
