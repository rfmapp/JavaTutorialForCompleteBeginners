package coreJava;

/**
 * Entendendo classes e objetos.
 * @author rafael
 *
 */

public class App13_1ClassesAndObjects {
	
	public static void main(String[] args) {
		
		// Criação do objeto da classe pessoa.
		App13_2ClassPessoa pessoa1 = new App13_2ClassPessoa();
		
		// Atribuição de valores às variáveis do objeto.
		pessoa1.nome = "Rafael";
		pessoa1.idade = 32;
		
		// Podemos criar outro objeto da mesma classe.
		App13_2ClassPessoa pessoa2 = new App13_2ClassPessoa();
		
		// Atribuição de valores ao outro objeto.
		pessoa2.nome = "André";
		pessoa2.idade = 25;
		
		// Podemos agora exibir os valores das características de cada objeto.
		System.out.println("Primeira Pessoa - Nome: " + pessoa1.nome + " - Idade: " + pessoa1.idade);
		System.out.println("Segunda Pessoa - Nome: " + pessoa2.nome + " - Idade: " + pessoa2.idade);
	}

}