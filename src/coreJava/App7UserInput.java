package coreJava;

import java.util.Scanner;

/**
 * Recebendo entrada de dados do usuário.
 * @author rafael
 *
 */

public class App7UserInput {
	
	public static void main(String[] args) {
		
		// Instanciação da classe Scanner, que recebe a entrada de dados.
		Scanner input = new Scanner(System.in);
		
		// Mensagem solicitando a entrada de dados.
		System.out.println("Digite o seu nome: ");
		
		// Variável que recebe o que foi digitado.
		String nome = input.nextLine();
		
		// Exibe o dado que foi digitado.
		System.out.println("O nome digitado foi " + nome);
		
		
	}

}
