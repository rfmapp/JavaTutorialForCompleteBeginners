package coreJava;

public class App13_2ClassPessoa {
	
	/*
	 * Classes podem representar qualquer coisa. Por exemplo, podemos ter uma classe 
	 * que represente uma "pessoa". Um objeto representa uma instância de uma classe. 
	 * Por exemplo, podemos ter uma objeto "pessoa1", que é uma pessoa. As classes 
	 * contém características e comportamentos (dados e métodos). Assim, o objeto 
	 * "pessoa1" pode ter as características "nome", "idade", etc e os 
	 * comportamentos "dormir", "comer", etc. 
	 */
	
	// Declaração das variáveis (características).
	String nome;
	String corDosOlhos;
	int idade;
	double salarioMensal;
	double salarioMinimo;
	double salarioIdeal;
	
	// Declaração dos métodos.
	// Este método fará o papel de apresentação da pessoa.
	// Ele não retornará nenhum tipo de dado, por isso o uso da palavra "void".
	void apresentacao(){
		System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos!");
	}
	
	void calculaAnosAteAposentadoria(){
		int anosQueFaltam = 65 - idade;
		
		System.out.println("Ainda faltam pelo menos " + anosQueFaltam + " anos para eu me aposentar.");
	}
	
	void calculasalarioIdeal(){
		salarioIdeal = salarioMinimo * 10;
	}
	
	double calculaQuantoFaltaSalario(){
		double salarioAMenos =  salarioIdeal - salarioMensal;
		
		return salarioAMenos;
	}
	
	// "getter" da variável corDosOlhos, simplesmente retorna o valor da variável.
	String getCorDosOlhos(){
		return corDosOlhos;
	}
		
}
