package coreJava;

/**
 * Trabalhando com Strings
 * @author rafael
 *
 */

public class App3WorkingWithStrings {
	
	public static void main(String[] args) {
		
		// Declaração de variáveis do tipo String
		String texto = "Meu nome";
		String espaço = " ";
		String conector = "é";
		String nome = "Rafael";
		
		// Exibindo os valores das variáveis
		System.out.println(texto + espaço + conector + espaço + nome);
		
		// Mas poderia ser simplesmente assim
		System.out.println("Meu nome é " + nome);
		
	}

}
