package coreJava;

/**
 * Trabalhando com arrays.
 * @author rafael
 *
 */

public class App10Arrays {
	
	public static void main(String[] args) {
		
		// Um array é um container (ou uma coleção) de elementos do mesmo tipo.
		// Assim se declara um array.
		int[] notas = new int[4];
		
		// O numero colocado entre colchetes refere-se à quantidade de 
		// elementos do array.
		// Atribuindo valores a cada elemento.
		notas[0] = 8;
		notas[1] = 10;
		notas[2] = 5;
		notas[3] = 2;
		
		// Podemos exibir o valor de um elemento.
		System.out.println(notas[0]);
		
		// Podemos ainda fazer um loop para receber todos o valores.
		for (int i = 0; i < notas.length; i++){
			System.out.println(notas[i]);
		}
	}

}
