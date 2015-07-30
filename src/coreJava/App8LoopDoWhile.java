package coreJava;

import java.util.Scanner;

/**
 * Trabalhando com Loop do tipo Do While.
 * @author rafael
 *
 */

public class App8LoopDoWhile {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero = 0;
		
		// Início do loop. Executa o código enquanto a condição for verdadeira.
		do {
			System.out.println("Digite um número inteiro entre 1 e 10: ");
			numero = input.nextInt();
		}
		// Essa é a condição e ela é avaliada depois do código a ser executa.
		// Assim, o código sempre será executado pelo menos uma vez.
		while(numero != 5);
		
		System.out.println("Acertou! O número secreto é " + numero);
	}

}
