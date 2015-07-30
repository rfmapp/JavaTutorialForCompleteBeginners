package coreJava;

import java.math.BigInteger;

/**
 * Trabalhando com Loop do tipo For.
 * @author rafael
 *
 */

public class App5LoopFor {
	
	public static void main(String[] args) {
		
		// Início do Loop. Aqui fazemos uso de um contador (i) que serve para 
		// definir o limite do teste da condição. Para verdade dada a condição...
		for(int i = 0; i < 11; i++){
			// ...esse código será executado.
			System.out.println("O número atual é " + i);
		}
		
		// Impressão de linha em branco, para melhor leitura.
		System.out.println();
		
		// Existe uma outra forma de concatenar o valor de variáveis com Strings
		for(int i = 0; i < 11; i++){
			// Utilizamos "printf", para uma exibição formatada de variáveis.
			// Utilizamos também \n para passar para a próxima linha.
			System.out.printf("O valor de i é %d.\n", i);
		}
	}

}
