package coreJava;

/**
 * Trabalhando com Loop do tipo While.
 * @author rafael
 *
 */

public class App4LoopWhile {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		// Início do Loop. Enquanto a condição for verdadeira...
		while(numero < 10)
		{
			// ...esse código será executado.
			System.out.println("O valor do número é " + numero);
			
			// Incremento da variável. Se não houver um incremento (ou decremento) 
			// no valor da variável a condição nunca se modificará e temos um loop 
			// infinito.
			numero++;
		}
	}

}
