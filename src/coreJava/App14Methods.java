package coreJava;

/**
 * Apresentando o uso de métodos de uma classe.
 * @author rafael
 *
 */

public class App14Methods {
	
	public static void main(String[] args) {
		
		// Instanciação de objeto da classe Pessoa.
		App13_2ClassPessoa pessoa = new App13_2ClassPessoa();
		
		// Atribuindo valores às características do objeto.
		pessoa.nome = "Rafael";
		pessoa.idade = 32;
		
		// Utilizando um método da classe.
		pessoa.apresentacao();
		
	}

}
