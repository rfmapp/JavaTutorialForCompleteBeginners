package coreJava;

import java.util.Scanner;

/**
 * Trabalhando com Loop do tipo Switch.
 * @author rafael
 *
 */

public class App9LoopSwitch {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Como avalia o serviço?(Bom/Regular/Ruim) ");
		String avaliacao = input.nextLine();
		
		// Início do loop. Executa determinado código dependendo da escolha feita.
		switch(avaliacao){
			case "Bom":
				System.out.println("Ficamos felizes que tenha gostado!");
				break;
				
			case "Regular":
				System.out.println("Precisamos melhorar. Faremos o possível para que sua próxima experiência seja mais satisfatória!");
				break;
				
			case "Ruim":
				System.out.println("Isso não pode continuar. Iremos resolver tudo o que está errado imediatamente!");
				break;
				
			default:
				System.out.println("Você precisa escolher uma das três opções dadas (Bom/Regular/Ruim).");
		}
	}

}
